"""
Steps to Move and Set Up the Script:

1. **Install Python**
   Make sure Python 3.x is installed on the target machine. If Python is not installed, use the following commands:

   **For Ubuntu/Debian:**
   $ sudo apt update
   $ sudo apt install python3 python3-pip -y

   **For CentOS/RHEL:**
   $ sudo yum install python3 -y

   **For Mac (with Homebrew):**
   $ brew install python

2. **Install Required Packages**
   Create a `requirements.txt` file with the following content:
   requests
   smtplib
   fpdf

   Install the required packages using:
   $ pip3 install -r requirements.txt

   Or manually install the packages:
   $ pip3 install requests fpdf

3. **Move the Script to the New Machine**
   Transfer the script file to the target machine using SCP, FTP, or any other method.
   Example using SCP:
   $ scp /path/to/your_script.py user@target_machine:/path/to/destination/

   Set the script as executable:
   $ chmod +x /path/to/destination/your_script.py

4. **Set Up Cron Jobs**
   Edit the crontab using:
   $ crontab -e

   Add the following cron jobs:

   **Health Check Cron Job (runs every 5 minutes):**
   */5 * * * * /usr/bin/python3 /path/to/your_script.py health

   **Daily Email Statistics Cron Job (runs at 1 AM EST):**
   0 6 * * * /usr/bin/python3 /path/to/your_script.py statistics

5. **Set Environment Variables (Optional)**
   If needed, set environment variables for API tokens or other sensitive data by adding the following lines to your `.bashrc` or `.bash_profile`:
   export OUTLOOK_ACCESS_TOKEN='your_fetcher_access_token'
   export SENDER_EMAIL='your_sender_email@outlook.com'
   export SENDER_PASSWORD='your_sender_password'

   Reload the environment variables:
   $ source ~/.bashrc

6. **Test the Script**
   Before adding it to cron, test both functionalities manually:
   **For health check:**
   $ python3 /path/to/your_script.py health

   **For email statistics:**
   $ python3 /path/to/your_script.py statistics
"""

import sys
import requests
import subprocess
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from email.mime.base import MIMEBase
from email import encoders
from datetime import datetime, timedelta
import os
from fpdf import FPDF

# Fetching Email Configuration (Outlook API)
FETCHER_OUTLOOK_API_URL = "https://graph.microsoft.com/v1.0/me/messages"
FETCHER_OUTLOOK_ACCESS_TOKEN = os.getenv('OUTLOOK_ACCESS_TOKEN', 'YOUR_FETCHER_ACCESS_TOKEN')  # Token for the email you want to fetch from
FETCHER_HEADERS = {
    "Authorization": f"Bearer {FETCHER_OUTLOOK_ACCESS_TOKEN}",
    "Content-Type": "application/json"
}

# Sending Email Configuration (Outlook SMTP)
SMTP_SERVER = 'smtp.office365.com'
SMTP_PORT = 587
SENDER_EMAIL = os.getenv('SENDER_EMAIL', 'your_sender_email@outlook.com')  # Sending email address
SENDER_PASSWORD = os.getenv('SENDER_PASSWORD', 'your_sender_password')
RECIPIENT_EMAIL = 'recipient@example.com'

# Application and MongoDB URLs
APPLICATION_URL = 'http://localhost:8080/health'  # Change to your app health check endpoint
MONGO_PORT = 27017  # Default MongoDB port

# Email subjects
FAILURE_SUBJECT = 'ALERT: Application/MongoDB Failure'
STATS_SUBJECT = 'Daily Email Statistics and Report'

# Function to fetch emails from the Fetcher Outlook API
def fetch_emails():
    start_time = (datetime.utcnow() - timedelta(hours=24)).strftime('%Y-%m-%dT%H:%M:%SZ')
    query = f"receivedDateTime ge {start_time}"
    
    response = requests.get(FETCHER_OUTLOOK_API_URL, headers=FETCHER_HEADERS, params={"$filter": query})
    
    if response.status_code == 200:
        emails = response.json().get('value', [])
        return emails
    else:
        print("Failed to fetch emails")
        return []

# Function to generate PDF report of email statistics
def generate_pdf_report(emails):
    num_emails = len(emails)
    num_attachments = sum(1 for email in emails if email.get('hasAttachments'))
    num_no_attachments = num_emails - num_attachments

    pdf = FPDF()
    pdf.add_page()
    pdf.set_font("Arial", size=12)

    # Add title and statistics
    pdf.cell(200, 10, txt="Daily Email Statistics", ln=True, align="C")
    pdf.ln(10)
    pdf.cell(200, 10, txt=f"Total Emails: {num_emails}", ln=True)
    pdf.cell(200, 10, txt=f"Emails with Attachments: {num_attachments}", ln=True)
    pdf.cell(200, 10, txt=f"Emails without Attachments: {num_no_attachments}", ln=True)

    # Add detailed email list
    pdf.ln(10)
    pdf.cell(200, 10, txt="Email List:", ln=True)
    for email in emails:
        pdf.ln(5)
        pdf.cell(200, 10, txt=f"Received: {email['receivedDateTime']}", ln=True)
        pdf.cell(200, 10, txt=f"Subject: {email['subject']}", ln=True)
        pdf.cell(200, 10, txt=f"From: {email['from']['emailAddress']['address']}", ln=True)
        pdf.cell(200, 10, txt=f"To: {', '.join([to['emailAddress']['address'] for to in email['toRecipients']])}", ln=True)

    # Save PDF
    pdf_output = "email_report.pdf"
    pdf.output(pdf_output)
    return pdf_output

# Function to send an email with PDF attachment using the Sender Outlook account
def send_email_with_attachment(subject, body, attachment):
    msg = MIMEMultipart()
    msg['From'] = SENDER_EMAIL
    msg['To'] = RECIPIENT_EMAIL
    msg['Subject'] = subject
    
    msg.attach(MIMEText(body, 'plain'))

    # Attach the PDF
    with open(attachment, "rb") as attachment_file:
        part = MIMEBase('application', 'octet-stream')
        part.set_payload(attachment_file.read())
        encoders.encode_base64(part)
        part.add_header('Content-Disposition', f'attachment; filename={os.path.basename(attachment)}')
        msg.attach(part)
    
    # Send email
    try:
        server = smtplib.SMTP(SMTP_SERVER, SMTP_PORT)
        server.starttls()
        server.login(SENDER_EMAIL, SENDER_PASSWORD)
        server.sendmail(SENDER_EMAIL, RECIPIENT_EMAIL, msg.as_string())
        print(f'Email sent successfully to {RECIPIENT_EMAIL}')
    except Exception as e:
        print(f'Failed to send email: {e}')
    finally:
        server.quit()

# Function to check if the application is up
def check_application_health():
    try:
        response = requests.get(APPLICATION_URL, timeout=10)
        if response.status_code == 200:
            return True
        else:
            return False
    except requests.RequestException:
        return False

# Function to check if MongoDB is running
def check_mongo_health():
    try:
        subprocess.check_output(['pgrep', '-f', 'mongod'])
        return True
    except subprocess.CalledProcessError:
        return False

# Function to send failure email
def send_failure_email(failure_type):
    msg = MIMEMultipart()
    msg['From'] = SENDER_EMAIL
    msg['To'] = RECIPIENT_EMAIL
    msg['Subject'] = FAILURE_SUBJECT
    body = f"Hi,\n\nThe following issue was detected:\n\n{failure_type}\n\nPlease check and resolve it as soon as possible."
    msg.attach(MIMEText(body, 'plain'))
    
    try:
        server = smtplib.SMTP(SMTP_SERVER, SMTP_PORT)
        server.starttls()
        server.login(SENDER_EMAIL, SENDER_PASSWORD)
        server.sendmail(SENDER_EMAIL, RECIPIENT_EMAIL, msg.as_string())
        print(f'Failure email sent for: {failure_type}')
    except Exception as e:
        print(f'Failed to send failure email: {e}')
    finally:
        server.quit()

# Function to run health checks
def run_health_checks():
    app_status = check_application_health()
    mongo_status = check_mongo_health()
    
    if not app_status:
        send_failure_email("Application is down!")
    if not mongo_status:
        send_failure_email("MongoDB is down!")
    if app_status and mongo_status:
        print("Both application and MongoDB are running fine.")

# Function to send daily email statistics
def send_daily_email_statistics():
    emails = fetch_emails()
    if emails:
        pdf_report = generate_pdf_report(emails)
        body = f"Daily email statistics report attached.\n\nTotal Emails: {len(emails)}"
        send_email_with_attachment(STATS_SUBJECT, body, pdf_report)

# Main function to handle command-line arguments for task selection
def main():
    if len(sys.argv) != 2:
        print("Usage: python3 your_script.py [health|statistics]")
        sys.exit(1)

    task = sys.argv[1]
    if task == "health":
        run_health_checks()
    elif task == "statistics":
        send_daily_email_statistics()
    else:
        print("Invalid argument. Use 'health' or 'statistics'.")
        sys.exit(1)

if __name__ == "__main__":
    main()
