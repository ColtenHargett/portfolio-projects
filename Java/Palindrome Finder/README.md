# Palindrome Finder

Scans a 104,000-word dictionary for palindromes (words that read the same forwards and backwards) and saves them to a file.

Built with a classmate.

---

## Overview

The program reads `dictionary.txt` one word at a time, tests each word with a recursive check, and writes every palindrome to a file the user names.

It finds **160 palindromes**, including *kayak*, *racecar*, *deified*, *redder* and *Malayalam*.

---

## How It Works

`isPalindrome` is recursive:

- **Base case:** a word with 0 or 1 letters is a palindrome.
- **General case:** if the first and last letters match (ignoring case), check the middle of the word. If they don't match, it isn't one.

Each call strips the outer two letters, so the word shrinks until it either fails a comparison or reaches the base case.

---

## Running it

```
javac *.java
java Main
```
