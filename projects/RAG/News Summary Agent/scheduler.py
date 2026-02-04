import time
from datetime import datetime
import subprocess

# Desired run time
TARGET_HOUR = 12
TARGET_MINUTE = 00

# Path to scripts
SCRAPER_PATH = "ENTER INFORMATION HERE"
DB_PATH = "ENTER INFORMATION HERE"
AGENT_PATH = "ENTER INFORMATION HERE"
VENV_PYTHON = "ENTER INFORMATION HERE"

def run_pipeline():
    print("Running daily news pipeline...")

    subprocess.run([VENV_PYTHON, SCRAPER_PATH])
    subprocess.run([VENV_PYTHON, DB_PATH])
    subprocess.run([VENV_PYTHON, AGENT_PATH])

    print("Pipeline finished.")

def time_until_target():
    now = datetime.now()
    target = now.replace(hour=TARGET_HOUR, minute=TARGET_MINUTE, second=0, microsecond=0)

    if now >= target:
        target = target.replace(day=now.day + 1)

    return (target - now).total_seconds()

if __name__ == "__main__":
    print(f"Scheduler started. Will run daily at {TARGET_HOUR:02}:{TARGET_MINUTE:02}.")

    while True:
        seconds_to_wait = time_until_target()
        hours = seconds_to_wait // 3600
        minutes = (seconds_to_wait % 3600) // 60
        print(f"Waiting {int(hours)}h {int(minutes)}m until next run...")

        time.sleep(seconds_to_wait)

        run_pipeline()

        print("Sleeping 24 hours until next run...\n")
        time.sleep(24 * 3600)
