import os
import chromadb
from dotenv import load_dotenv
import google.generativeai as genai
from datetime import datetime
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

# Load API key
load_dotenv()
genai.configure(api_key=os.getenv("GEMINI_API_KEY"))

# Email configuration
EMAIL_ADDRESS = os.getenv("EMAIL_ADDRESS")
EMAIL_PASSWORD = os.getenv("EMAIL_PASSWORD")
TO_EMAILS = os.getenv("TO_EMAILS", "").split(",")
TO_EMAILS = [email.strip() for email in TO_EMAILS if email.strip()]

# Format for current date
current_date = datetime.now().strftime("%A, %B %d, %Y")

# Initialize ChromaDB
CHROMA_PATH = "chroma_db"
chroma_client = chromadb.PersistentClient(path=CHROMA_PATH)
collection = chroma_client.get_or_create_collection(name="news_collection")

# Retrieve documents in the collection
all_data = collection.get()
retrieved_docs = all_data.get("documents", [])
context = "\n\n".join(retrieved_docs).strip()

# Gemini prompt
prompt = f"""
You are a helpful assistant. Your task is to write a professional news-style summary of major global and U.S. events from the last 24 hours, using only the information provided in the context.

Your response should:
- Be written like a short, well-edited newspaper article
- Avoid Markdown, bold text, bullet points, or special formatting
- Use short section titles followed by a dash (like "Medicaid Cuts -"), with no extra styling
- Focus only on stories with clear political, economic, or social impact and avoid stories that dont have a clear impact
- Only include quotes if they are relevant and credible
- End the article cleanly, without a "Sources" section, sign-off or resolution 

Start with the line: "Today is {current_date}. Here is the news from the last 24 hours:"

Context:
{context}
"""

# Generate response
model = genai.GenerativeModel(model_name="gemini-2.0-flash")
response = model.generate_content(prompt)
full_response = response.text.strip()

# Create email
msg = MIMEMultipart()
msg["From"] = EMAIL_ADDRESS
msg["To"] = ", ".join(TO_EMAILS)
msg["Subject"] = f"News Recap for {current_date}"
msg.attach(MIMEText(full_response, "plain"))

# Send email
try:
    with smtplib.SMTP_SSL("smtp.gmail.com", 465) as smtp:
        smtp.login(EMAIL_ADDRESS, EMAIL_PASSWORD)
        smtp.send_message(msg, from_addr=EMAIL_ADDRESS, to_addrs=TO_EMAILS)
        print("Email sent successfully to:", ", ".join(TO_EMAILS))
except Exception as e:
    print(f"Failed to send email: {e}")