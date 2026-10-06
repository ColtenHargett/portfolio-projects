# Word Alphabetizer

Type in words in any order and get them back alphabetized, using a binary search tree I built from scratch.

Built with a classmate.

---

## Overview

Each word is inserted into a binary search tree: smaller words go left, larger words go right. An **inorder traversal** (left, node, right) then visits every word in sorted order.

The tree also supports **preorder** and **postorder** traversals, which print the same words in different orders depending on the tree's shape.

---

## How It Works

- `insert` walks down from the root without recursion, tracking the parent node, and attaches the new word as a left or right child.
- The three traversals are recursive, which keeps each one to just a few lines.

---

## What I learned

The order you insert words changes the shape of the tree. Inserting already-sorted words builds a tree that's really just a linked list, so every search has to walk the whole thing. A balanced tree cuts the remaining words in half at every step. The same seven words can make a tree of height 4 or height 7 depending only on insertion order.

---

## Running it

```
javac *.java
java Main
```

Type `ZZZ` to stop entering words.
