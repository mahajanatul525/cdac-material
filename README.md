import os
import pandas as pd
from datetime import datetime

def convert_xlsb_to_csv(xlsb_file, csv_file):
    try:
        # Read the xlsb file
        df = pd.read_excel(xlsb_file, engine='pyxlsb')
        
        # Get the total number of rows
        total_rows = len(df)
        
        # Initialize an empty list to store rows
        rows = []
        
        # Process each row
        for i, row in df.iterrows():
            rows.append(row)
            # Print progress for rows
            print(f'Converting {os.path.basename(xlsb_file)}: Row {i+1}/{total_rows}', end='\r')
        
        # Write to CSV
        df.to_csv(csv_file, index=False)
        
        print(f'\nCompleted converting {os.path.basename(xlsb_file)}')
        return True, None
    except Exception as e:
        return False, str(e)

def process_directory(directory):
    files = [f for f in os.listdir(directory) if f.endswith('.xlsb')]
    total_files = len(files)
    report = []
    
    for i, filename in enumerate(files, start=1):
        xlsb_path = os.path.join(directory, filename)
        csv_path = os.path.join(directory, filename.replace('.xlsb', '.csv'))
        success, error = convert_xlsb_to_csv(xlsb_path, csv_path)
        report.append({
            'file': filename,
            'status': 'Success' if success else 'Failed',
            'error': error
        })
        
        # Progress indicator for file processing
        print(f'Processing file {i}/{total_files}: {filename} - {"Success" if success else "Failed"}')
    
    return report

def generate_report(report, report_file):
    with open(report_file, 'w') as f:
        f.write('File,Status,Error\n')
        for entry in report:
            f.write(f"{entry['file']},{entry['status']},{entry.get('error', '')}\n")

if __name__ == "__main__":
    directory = 'path_to_your_directory'
    report_file = 'conversion_report.csv'
    
    print(f'Starting conversion of .xlsb files in directory: {directory}')
    report = process_directory(directory)
    generate_report(report, report_file)
    
    print(f"Conversion completed. Report generated at {report_file}")
