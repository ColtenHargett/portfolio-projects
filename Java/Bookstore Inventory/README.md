# Bookstore Inventory

A command-line inventory system for a small bookstore. It loads the store's books from a file into a HashMap so any title can be looked up instantly.

Built with a classmate.

---

## Overview

```
1. List all books
2. List all books that are cheaper than the chosen price
3. Add a new book
4. Update the price of a book
5. Remove a book
6. Find a book by title
7. Quit
```

---

## How It Works

- **A HashMap** maps each title to its price, so lookups, updates and removals don't have to search a list.
- **File input** reads `books.txt` (`title:price`) when the program starts.
- **Partial search** finds every title that contains the text you type, ignoring case.
- **Input validation** checks every menu choice and price before using it, so typing a letter where a number belongs prints a message instead of crashing.

---

## Running it

```
javac *.java
java Main
```
