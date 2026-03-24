# News Summary Agent

This project is a modular agent pipeline that scrapes news, stores it, and generates summaries automatically.

The goal was to build a system that can take in real-world data (news articles), process it in a structured way, and turn it into something useful without manual effort.

---

## Overview

The system is built as a pipeline with separate components that each handle a specific task:

1. Scrape news articles  
2. Store them in a structured database  
3. Process and summarize the content  
4. Run automatically on a schedule  

Instead of one large script, everything is split into smaller pieces that work together.

---

## How It Works

### Scraper (`Scraper.py`)
- Pulls news articles from external sources  
- Extracts relevant data (titles, content, metadata)  
- Prepares it for storage  

---

### Database Builder (`Database_Builder.py`)
- Structures and stores the scraped data  
- Ensures consistency across stored articles  
- Acts as the foundation for later processing  

---

### Agent (`Agent.py`)
- Processes stored articles  
- Generates summaries using an AI model  
- Focuses on turning raw text into something readable and useful  

---

### Scheduler (`scheduler.py`)
- Automates the entire pipeline  
- Runs the system at set intervals  
- Keeps the data and summaries up to date  

---

## Notes

This project is focused on:
- system design  
- automation  
- and practical use of AI  

It is not meant to be a production news platform, but a working example of how these pieces can fit together.
