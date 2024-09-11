import requests
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from email.mime.base import MIMEBase
from email import encoders
from datetime import datetime, timedelta, timezone
import os
import pandas as pd
import csv


# Azure AD Application Registration
CLIENT_ID = os.getenv('CLIENT_ID', '')
CLIENT_SECRET = os.getenv('CLIENT_SECRET', '')
TENANT_ID = os.getenv('TENANT_ID', '')

# Token Endpoint URL
TOKEN_URL = f"https://login.microsoftonline.com/{TENANT_ID}/oauth2/token"

# Fetching Email Configuration (Outlook API)
FETCHER_OUTLOOK_API_URL = "https://graph.microsoft.com/v1.0/users/kas@internal.synopsys.com/mailFolders/inbox/messages"
FETCHER_OUTLOOK_ACCESS_TOKEN = None  # Placeholder for access token
FETCHER_HEADERS = {
    "Authorization": f"Bearer {FETCHER_OUTLOOK_ACCESS_TOKEN}",
    "Content-Type": "application/json"
}

# Sending Email Configuration (Outlook SMTP)
SMTP_SERVER = 'smtp.office365.com'
SMTP_PORT = 587
SENDER_EMAIL = os.getenv('SENDER_EMAIL', '')  # Sending email address
SENDER_PASSWORD = os.getenv('SENDER_PASSWORD', '')

# Application and MongoDB URLs
APPLICATION_URL = 'http://localhost:8080/health'  # Change to your app health check endpoint
MONGO_PORT = 27017  # Default MongoDB port

# Email subjects
STATS_SUBJECT = 'Daily Email Statistics and Report'

# Function to get an access token from Azure AD
def get_access_token():
    data = {
        'grant_type': 'client_credentials',
        'client_id': CLIENT_ID,
        'client_secret': CLIENT_SECRET,
        'resource': 'https://graph.microsoft.com'
    }
    response = requests.post(TOKEN_URL, data=data)
    if response.status_code == 200:
        return response.json().get('access_token')
    else:
        print("Failed to get access token")
        return None

# Fetching Email Configuration (Outlook API)
def fetch_emails():
    global FETCHER_OUTLOOK_ACCESS_TOKEN
    FETCHER_OUTLOOK_ACCESS_TOKEN = get_access_token()
    if FETCHER_OUTLOOK_ACCESS_TOKEN is None:
        print("Cannot proceed without an access token")
        return []
    
    FETCHER_HEADERS["Authorization"] = f"Bearer {FETCHER_OUTLOOK_ACCESS_TOKEN}"
    
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

    emails = []
    next_link = FETCHER_OUTLOOK_API_URL  # Initially set to the base URL

    while next_link:
        # Make the GET request with headers and separate filters
        response = requests.get(next_link, headers=FETCHER_HEADERS, params=params)

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
    return emails
    

# Function to get the count of attachments for a specific email
def get_attachment_count(message_id):
    # URL to fetch attachments for a specific email
    url = f"{FETCHER_OUTLOOK_API_URL}/{message_id}/attachments"

    # Make the GET request to fetch attachments
    response = requests.get(url, headers=FETCHER_HEADERS)

    if response.status_code == 200:
        attachments = response.json().get('value', [])
        return len(attachments)  # Return the count of attachments
    else:
        return 0  # If there's an issue, return 0
    
# Function to generate CSV report of email statistics and details
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

    return csv_details_output

# Function to send a basic email
def send_email(recipients,subject, body):
    msg = MIMEMultipart()
    msg['From'] = SENDER_EMAIL
    msg['To'] = recipients
    msg['Subject'] = subject
    msg.attach(MIMEText(body, 'plain'))

    try:
        server = smtplib.SMTP(SMTP_SERVER, SMTP_PORT)
        server.starttls()
        server.login(SENDER_EMAIL, SENDER_PASSWORD)
        server.send_message(msg)
        print(f'Email sent successfully to {recipients}')
    except Exception as e:
        print(f'Failed to send email: {str(e)}')
    finally:
        server.quit()

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
        print(f'Email sent successfully to {RECIPIENT_EMAIL}')
    except Exception as e:
        print(f'Failed to send email: {str(e)}')
    finally:
        server.quit()

# Function to prepare the email body with statistics in HTML tabular format
def prepare_statistics_body(emails):
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

# Function to fetch and send daily email statistics
def send_daily_email_statistics():
    emails = fetch_emails()
    if emails:
        csv_details_report = generate_csv_report(emails)
        recipients = read_recipient_details("recipient_statistics.csv")
        body = prepare_statistics_body(emails)
        send_email_with_attachments(recipients,STATS_SUBJECT, body, [csv_details_report])
        
        # Clean up files after sending
        os.remove(csv_details_report)
    else:
        print("No emails found for the last 24 hours.")

def read_recipient_details(file_path):
    recipient_emails = []
    try:
        with open(file_path, mode='r') as file:
            csv_reader = csv.DictReader(file)
            for row in csv_reader:
                recipient_emails.append(row['Recipient'])

    except Exception as e:
        print(f"Failed to read email details: {e}")
    
    return recipient_emails

if __name__ == "__main__":
    send_daily_email_statistics()