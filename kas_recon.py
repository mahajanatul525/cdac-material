import csv
import smtplib
import configparser
import os
import requests
import logging
from datetime import datetime, timedelta
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
from email.mime.base import MIMEBase
from email import encoders
from pymongo import MongoClient

# Constants and Configuration
PROPERTIES_FILE = "auth.properties"
MONGO_URI = "mongodb://localhost:27017/"
DB_NAME = "your_db"
COLLECTION_NAME = "email_statistics"
OUTLOOK_API_ENDPOINT = "https://outlook.office.com/api/v2.0/me/messages"
RECIPIENT_FILE = "recipients.txt"
CSV_REPORT_FILE = "email_report.csv"
SENDER_EMAIL = "your-email@example.com"
SMTP_SERVER = "smtp.your-email-provider.com"
SMTP_PORT = 587
EMAIL_PASSWORD = "YOUR_EMAIL_PASSWORD"
LOG_FILE = "script.log"
DEBUG_MODE = True  # Toggle this to False for release mode

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
        app_id = config.get("DEFAULT", "appId")
        app_password = config.get("DEFAULT", "appPassword")
        tenant_id = config.get("DEFAULT", "tenantId")
        logging.debug("Properties file loaded successfully.")
        return app_id, app_password, tenant_id
    except Exception as e:
        logging.error("Failed to load properties file: %s", str(e))
        send_error_email("An unexpected error occurred. Please contact support.")
        return None, None, None

# Step 1: Generate a new OAuth token for accessing the Outlook API
def generate_token(app_id, app_password, tenant_id):
    """
    Generates a new access token using client credentials from the properties file.
    """
    token_url = f"https://login.microsoftonline.com/{tenant_id}/oauth2/v2.0/token"
    data = {
        "client_id": app_id,
        "client_secret": app_password,
        "scope": "https://outlook.office.com/.default",
        "grant_type": "client_credentials"
    }
    try:
        response = requests.post(token_url, data=data)
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
    """
    Fetches emails from the Outlook API within the last 24 hours.
    """
    headers = {"Authorization": f"Bearer {access_token}"}
    params = {"$filter": "receivedDateTime ge " + (datetime.utcnow() - timedelta(days=1)).isoformat() + "Z"}
    try:
        response = requests.get(OUTLOOK_API_ENDPOINT, headers=headers, params=params)
        response.raise_for_status()
        emails = response.json().get('value', [])
        logging.debug(f"Fetched {len(emails)} emails.")
        return emails
    except requests.RequestException as e:
        logging.error("Failed to fetch emails: %s", str(e))
        send_error_email()
        return None

# Step 3: Calculate email statistics
def calculate_email_statistics(emails):
    """
    Calculates the email statistics for reporting purposes.
    """
    total_emails = len(emails)
    unread_emails = len([email for email in emails if not email['isRead']])
    read_emails = total_emails - unread_emails
    emails_with_attachments = len([email for email in emails if email['hasAttachments']])
    logging.debug(f"Statistics - Total: {total_emails}, Unread: {unread_emails}, Read: {read_emails}, Attachments: {emails_with_attachments}")
    return {
        "total_emails": total_emails,
        "unread_emails": unread_emails,
        "read_emails": read_emails,
        "emails_with_attachments": emails_with_attachments
    }

# Step 4: Retrieve MongoDB statistics
def retrieve_mongo_statistics():
    """
    Retrieves statistics from MongoDB collection.
    """
    client = MongoClient(MONGO_URI)
    db = client[DB_NAME]
    collection = db[COLLECTION_NAME]
    return list(collection.find())

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

# Step 7: Send the email with the report attached
def send_email():
    """
    Sends an email with the CSV report attached to the recipients.
    """
    recipients = load_recipients()
    if not recipients:
        return

    msg = MIMEMultipart()
    msg['From'] = SENDER_EMAIL
    msg['To'] = ", ".join(recipients)
    msg['Subject'] = "Daily Email Statistics Report"

    body = MIMEText("Please find the daily email statistics report attached.", 'plain')
    msg.attach(body)

    attachment = MIMEBase('application', 'octet-stream')
    with open(CSV_REPORT_FILE, "rb") as file:
        attachment.set_payload(file.read())
    encoders.encode_base64(attachment)
    attachment.add_header('Content-Disposition', f"attachment; filename={CSV_REPORT_FILE}")
    msg.attach(attachment)

    try:
        with smtplib.SMTP(SMTP_SERVER, SMTP_PORT) as server:
            server.starttls()
            server.login(SENDER_EMAIL, EMAIL_PASSWORD)
            server.sendmail(SENDER_EMAIL, recipients, msg.as_string())
        logging.debug("Email sent successfully.")
    except Exception as e:
        logging.error("Failed to send email: %s", str(e))
        send_error_email()

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
            server.login(SENDER_EMAIL, EMAIL_PASSWORD)
            server.sendmail(SENDER_EMAIL, recipients, msg.as_string())

        logging.info("Error notification sent to recipients.")
    except Exception as e:
        logging.error("Failed to send error notification email: %s", str(e))

# Main function to execute all steps
def main():
    try:
        app_id, app_password, tenant_id = load_config()
        if not app_id or not app_password or not tenant_id:
            return

        access_token = generate_token(app_id, app_password, tenant_id)
        if not access_token:
            return

        emails = fetch_emails(access_token)
        if not emails:
            return

        stats = calculate_email_statistics(emails)
        mongo_stats = retrieve_mongo_statistics()
        create_csv_report(emails, mongo_stats)
        send_email()
    except Exception as e:
        logging.error("An unexpected error occurred during script execution: %s", str(e))
        send_error_email()

if __name__ == "__main__":
    main()
