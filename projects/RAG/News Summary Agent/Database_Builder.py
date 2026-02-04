from langchain_community.document_loaders import TextLoader
from langchain.text_splitter import RecursiveCharacterTextSplitter
import chromadb
import os
import shutil

# Set paths
DATA_PATH = "Data"
CHROMA_PATH = "chroma_db"

# Completely clear the ChromaDB directory
if os.path.exists(CHROMA_PATH):
    shutil.rmtree(CHROMA_PATH)
os.makedirs(CHROMA_PATH, exist_ok=True)

# Initialize the Chroma client
chroma_client = chromadb.PersistentClient(path=CHROMA_PATH)
collection = chroma_client.get_or_create_collection(name="news_collection")

# Load .txt documents
raw_documents = []
for filename in os.listdir(DATA_PATH):
    if filename.endswith(".txt"):
        filepath = os.path.join(DATA_PATH, filename)
        loader = TextLoader(filepath)
        raw_documents.extend(loader.load())

# Split into chunks
text_splitter = RecursiveCharacterTextSplitter(
    chunk_size=500,
    chunk_overlap=100,
    length_function=len,
    is_separator_regex=False,
)

chunks = text_splitter.split_documents(raw_documents)

# Prepare for Chroma insert
documents = []
metadata = []
ids = []

for i, chunk in enumerate(chunks):
    documents.append(chunk.page_content)
    ids.append(f"ID{i}")
    metadata.append(chunk.metadata)

# Upload to Chroma
collection.upsert(
    documents=documents,
    metadatas=metadata,
    ids=ids,
)
