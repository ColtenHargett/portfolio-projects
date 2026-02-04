import feedparser
import requests
import os
import re
from newspaper import Article
from datetime import datetime, timedelta, timezone

# RSS feeds
RSS_FEEDS = {
    "NPR": "https://feeds.npr.org/1001/rss.xml",
    "BBC": "https://feeds.bbci.co.uk/news/rss.xml",
    "ABC News": "https://abcnews.go.com/abcnews/topstories",
    "CBS News": "https://www.cbsnews.com/latest/rss/main",
    "NBC News": "https://feeds.nbcnews.com/nbcnews/public/news",
}

# Set up data folder
SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
DATA_DIR = os.path.join(SCRIPT_DIR, "Data")
os.makedirs(DATA_DIR, exist_ok=True)

# Clear out existing files
for filename in os.listdir(DATA_DIR):
    file_path = os.path.join(DATA_DIR, filename)
    if os.path.isfile(file_path) and filename.endswith(".txt"):
        os.remove(file_path)

# 24-hour window
now = datetime.now(timezone.utc)
cutoff = now - timedelta(days=1)


# Clean filenames
def clean_filename(title):
    return re.sub(r'[\\/*?:"<>|]', "_", title)[:100]


# Track saved articles
total_saved = 0
source_counts = {}

# Loop through each RSS feed
for source_name, feed_url in RSS_FEEDS.items():
    print(f"Parsing {source_name} feed...")

    try:
        response = requests.get(feed_url, timeout=10)
        feed = feedparser.parse(response.text)
    except requests.exceptions.RequestException as e:
        print(f"Failed to fetch {source_name} feed: {e}")
        source_counts[source_name] = 0
        continue

    source_saved = 0

    for entry in feed.entries:
        if "published_parsed" not in entry:
            continue

        pub_time = datetime(*entry.published_parsed[:6], tzinfo=timezone.utc)
        if pub_time < cutoff:
            continue  # Skip if older than 24 hours

        title = entry.get("title", "No Title")
        link = entry.get("link", "No Link")

        # Skip non-article links (video, live, gallery, etc.)
        if any(kw in link.lower() for kw in ["video", "watch", "live", "gallery"]):
            continue

        pub_str = pub_time.strftime('%Y-%m-%d %H:%M:%S UTC')

        try:
            article = Article(link)
            article.download()
            article.parse()
            content = article.text.strip()

            # Skip if too short or clearly not article-like
            if len(content.split()) < 100:
                continue

        except Exception as e:
            continue  # Skip if article can't be parsed

        # Save article to .txt file
        full_text = f"Source: {source_name}\nTitle: {title}\nPublished: {pub_str}\nLink: {link}\n\n{content}"
        filename = clean_filename(f"{source_name} - {title}") + ".txt"
        filepath = os.path.join(DATA_DIR, filename)

        with open(filepath, "w", encoding="utf-8") as f:
            f.write(full_text)

        source_saved += 1
        total_saved += 1

    source_counts[source_name] = source_saved
    print(f"Saved {source_saved} article(s) from {source_name}.\n")

# Summary
print("Summary:")
for source, count in source_counts.items():
    print(f"- {source}: {count} article(s)")
print(f"\nTotal articles saved: {total_saved}")
print(f"Saved in folder: {DATA_DIR}")
