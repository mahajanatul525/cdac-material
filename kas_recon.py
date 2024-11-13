import csv
import smtplib
import configparser
import os
import requests
import logging
import pandas as pd
from datetime import datetime, timedelta
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
from email.mime.base import MIMEBase
from email import encoders
from datetime import datetime, timedelta, timezone
import pandas as pd

#from pymongo import MongoClient

# Constants and Configuration
PROPERTIES_FILE = "auth.properties"
MONGO_URI = "mongodb://localhost:27017/"
DB_NAME = "your_db"
COLLECTION_NAME = "email_statistics"
OUTLOOK_API_ENDPOINT = "https://graph.microsoft.com/v1.0/users/kas@internal.synopsys.com/mailFolders/inbox/messages"
RECIPIENT_FILE = "recipients.txt"
CSV_REPORT_FILE = "email_report.csv"
SMTP_SERVER = 'smtp.office365.com'
SMTP_PORT = 587
SENDER_EMAIL = os.getenv('SENDER_EMAIL', '**')  # Sending email address
SENDER_PASSWORD = os.getenv('SENDER_PASSWORD', '**')
LOG_FILE = "script.log"
DEBUG_MODE = True  # Toggle this to False for release mode
CERTIFICATE_FILE = r"C:\Users\atul.mahajan.saama.c\Downloads\login-microsoftonline-com-chain.pem"


# Logging configuration
logging.basicConfig(filename=LOG_FILE, 
                    level=logging.DEBUG if DEBUG_MODE else logging.ERROR,
                    format="%(asctime)s - %(levelname)s - %(message)s")

# Load configuration from the properties file
def load_config():
    """
    Load client_id, client_secret, and tenant_id from the auth.properties file.
    """
    config = configparser.ConfigParser()
    try:
        config.read(PROPERTIES_FILE)
        # app_id = config.get("DEFAULT", "appId")
        # app_password = config.get("DEFAULT", "appPassword")
        # tenant_id = config.get("DEFAULT", "tenantId")
        logging.debug("Properties file loaded successfully.")
        return config["DEFAULT"]
    except Exception as e:
        logging.error("Failed to load properties file: %s", str(e))
        send_error_email("An unexpected error occurred. Please contact support.")
        return None, None, None

# Step 1: Generate a new OAuth token for accessing the Outlook API
def generate_token(app_id, app_password, tenant_id):
    """
    Generates a new access token using client credentials from the properties file.
    """
    token_url = f"https://login.microsoftonline.com/{tenant_id}/oauth2/token"

    data = {
        "client_id": app_id,
        "client_secret": app_password,
        "resource": "https://graph.microsoft.com",
        "grant_type": "client_credentials"
    }
    try:
        response = requests.post(token_url, data=data, verify=CERTIFICATE_FILE)
        response.raise_for_status()
        token = response.json().get("access_token")
        logging.debug("Successfully generated access token.")
        return token
    except requests.RequestException as e:
        logging.error("Failed to generate access token: %s", str(e))
        send_error_email("An unexpected error occurred. Please contact support.")
        return None

# Step 2: Fetch emails from the Outlook API
def fetch_emails(access_token):
    # Prepare the headers
    headers = {"Authorization": f"Bearer {access_token}"}
     # Get the current time in UTC
    now = datetime.now(timezone.utc)
    
    # Define the run time (8:45 AM UTC)
    current_run_time = now.replace(hour=8, minute=45, second=0, microsecond=0)
    previous_run_time = current_run_time - timedelta(days=1)

    # Format as ISO 8601 with 'Z' for UTC
    start_time_utc = previous_run_time.strftime('%Y-%m-%dT%H:%M:%SZ')
    end_time_utc = current_run_time.strftime('%Y-%m-%dT%H:%M:%SZ')
    
     # Set the query parameters (filters)
    params = {
        '$filter': f"receivedDateTime ge {start_time_utc} and receivedDateTime le {end_time_utc}"
    }
    logging.debug(f"Emails filters: {str(params)}")
    emails = []
    next_link = OUTLOOK_API_ENDPOINT  # Initially set to the base URL
    try:
        while next_link:
            # Make the GET request with headers and separate filters
            response = requests.get(next_link, headers=headers, params=params, verify=CERTIFICATE_FILE)

            # Check if the request was successful
            if response.status_code == 200:
                data = response.json()
                emails.extend(data.get('value', []))  # Add emails to the list

                # Check if there is a next link for more results
                next_link = data.get('@odata.nextLink', None)
                # Reset params after the first call as nextLink has all the filters embedded
                params = None
            else:
                # If not successful, return the error message
                return {"error": response.status_code, "message": response.text}
        logging.debug(f"Fetched {len(emails)} emails.")
        return emails
    except requests.RequestException as e:
        logging.error("Failed to fetch emails: %s", str(e))
        send_error_email()
        return None
    
# Function to get the count of attachments for a specific email
def get_attachment_count(message_id, access_token):
    # URL to fetch attachments for a specific email
    url = f"{OUTLOOK_API_ENDPOINT}/{message_id}/attachments"

     # Prepare the headers
    headers = {"Authorization": f"Bearer {access_token}"}

    # Make the GET request to fetch attachments
    response = requests.get(url, headers=headers, verify=CERTIFICATE_FILE)

    if response.status_code == 200:
        attachments = response.json().get('value', [])
        return len(attachments)  # Return the count of attachments
    else:
        return 0  # If there's an issue, return 0
        
# Step 4: Retrieve MongoDB statistics
def retrieve_mongo_statistics():
    # """
    # Retrieves statistics from MongoDB collection.
    # """
    # client = MongoClient(MONGO_URI)
    # db = client[DB_NAME]
    # collection = db[COLLECTION_NAME]
    # return list(collection.find())
    return []

# Function to prepare the email body with statistics in HTML tabular format
def prepare_email_body(emails):
    num_emails = len(emails)
    num_attachments = sum(1 for email in emails if email.get('hasAttachments'))
    num_no_attachments = num_emails - num_attachments

    # Create CSV data
    data = {
        "Total Emails": num_emails,
        "Emails with Attachments": num_attachments,
        "Emails without Attachments": num_no_attachments
    }
    
    html_body = """
    <html>
        <body>
            <h3>Daily Email Statistics</h3>
            <table border="1" cellpadding="5" cellspacing="0">
                <tr>
                    <th>Total Emails</th>
                    <th>Emails w/ attachments</th>
                    <th>Emails w/o attachments</th>
                </tr>
    """
    
    # Add each row from statistics data to the table
    html_body += f"""
            <tr>
                <td>{data['Total Emails']}</td>
                <td>{data['Emails with Attachments']}</td>
                <td>{data['Emails without Attachments']}</td>
            </tr>
    """
    
    # Close the table and HTML body
    html_body += """
            </table>
        </body>
    </html>
    """
    
    return html_body
# Function to send an email with PDF and CSV attachments using the Sender Outlook account
def send_email_with_attachments(recipients,subject, body, attachments):
    RECIPIENT_EMAIL = ', '.join(recipients)
    msg = MIMEMultipart()
    msg['From'] = SENDER_EMAIL
    msg['To'] = RECIPIENT_EMAIL
    msg['Subject'] = subject
    
    msg.attach(MIMEText(body, 'html'))

    for attachment in attachments:
        with open(attachment, "rb") as attachment_file:
            part = MIMEBase('application', 'octet-stream')
            part.set_payload(attachment_file.read())
            encoders.encode_base64(part)
            part.add_header(
                "Content-Disposition",
                f"attachment; filename= {os.path.basename(attachment)}",
            )
            msg.attach(part)

    try:
        server = smtplib.SMTP(SMTP_SERVER, SMTP_PORT)
        server.starttls()
        server.login(SENDER_EMAIL, SENDER_PASSWORD)
        server.send_message(msg)
        logging.debug(f"Email sent successfully to {RECIPIENT_EMAIL}")
    except Exception as e:
        logging.debug(f'Failed to send email: {str(e)}')
    finally:
        server.quit()


# Step 5: Create a CSV report
def create_csv_report(emails, mongo_stats):
    """
    Creates a CSV report with email details and MongoDB statistics.
    """
    with open(CSV_REPORT_FILE, mode='w', newline='') as file:
        writer = csv.writer(file)
        writer.writerow(["Email Subject", "Sender", "Received Time", "Is Read", "Has Attachments"])
        for email in emails:
            writer.writerow([
                email.get("subject", ""),
                email.get("from", {}).get("emailAddress", {}).get("address", ""),
                email.get("receivedDateTime", ""),
                email.get("isRead", ""),
                email.get("hasAttachments", "")
            ])
        logging.debug("CSV report created successfully.")
        
def generate_csv_report(emails):
    # Create detailed email list DataFrame
    email_details = []
    for email in emails:
        if email.get('hasAttachments', False):
            # Fetch the attachment details using the message ID
            #email['attachmentCount'] = get_attachment_count(email['id'])
            email['HasAttachments'] = True
        else:
            #email['attachmentCount'] = 0
            email['hasAttachments'] = False

        email_details.append({
            "Received Time": email['receivedDateTime'],
            "Subject": email['subject'],
            "From": email['from']['emailAddress']['address'],
            "To": ', '.join([to['emailAddress']['address'] for to in email['toRecipients']]),
            "HasAttachment": email['hasAttachments']
            #"AttachmentCount": email['attachmentCount']
        })
    df_details = pd.DataFrame(email_details)

    # Save details to CSV
    csv_details_output = "email_details_report.csv"  # Change this path as needed
    df_details.to_csv(csv_details_output, index=False)
    logging.debug("CSV report created successfully.")

    return csv_details_output

# Step 6: Load recipients from the recipient file
def load_recipients():
    """
    Loads recipient email addresses from the recipient file.
    """
    try:
        with open(RECIPIENT_FILE, "r") as file:
            recipients = [line.strip() for line in file.readlines()]
            logging.debug("Loaded recipients from file.")
            return recipients
    except FileNotFoundError as e:
        logging.error("Recipient file not found: %s", str(e))
        send_error_email()
        return None


# Generic error notification email
def send_error_email(message="An unexpected error occurred. Please contact support."):
    """
    Sends a generic error notification to the recipients listed in the recipient file.
    """
    recipients = load_recipients()
    if not recipients:
        return

    try:
        msg = MIMEMultipart()
        msg['From'] = SENDER_EMAIL
        msg['To'] = ", ".join(recipients)
        msg['Subject'] = "Script Execution Error Notification"

        body = MIMEText(message, 'plain')
        msg.attach(body)

        with smtplib.SMTP(SMTP_SERVER, SMTP_PORT) as server:
            server.starttls()
            server.login(SENDER_EMAIL, SENDER_PASSWORD)
            server.sendmail(SENDER_EMAIL, recipients, msg.as_string())

        logging.info("Error notification sent to recipients.")
    except Exception as e:
        logging.error("Failed to send error notification email: %s", str(e))

# Main function to execute all steps
def main():
    try:
        config = load_config()
        if not config["appId"] or not config["appPassword"] or not config["tenantId"]:
            return

        access_token = generate_token(config["appId"], config["appPassword"], config["tenantId"])
        if not access_token:
            return

        emails = fetch_emails(access_token)
        if not emails:
            return

        recipients = load_recipients()
        csv_emails_report = generate_csv_report(emails)
        email_body = prepare_email_body(emails)
        send_email_with_attachments(recipients,"Sample Sub",email_body,[csv_emails_report])

    except Exception as e:
        logging.error("An unexpected error occurred during script execution: %s", str(e))
        send_error_email()

if __name__ == "__main__":
    main()
