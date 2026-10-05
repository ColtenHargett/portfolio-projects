# Sandwich Stack

A sandwich builder powered by a stack I wrote from scratch. Like a real sandwich, you can only add or remove ingredients from the top, but you can see the whole thing at any time.

Built with a classmate.

---

## Overview

```
1. Add an ingredient to the sandwich.
2. Remove an ingredient.
3. Show the sandwich.
0. Finish.
```

```
-Bread-
Cheese
Turkey
-Bread-
```

---

## How It Works

- **Stack** is a linked list where every operation happens at the top: `push` adds a new node in front, and `pop` removes the front node.
- **Node** holds one ingredient and a link to the one below it.
- Popping from an empty sandwich returns `null` instead of crashing, and the program tells the user there's nothing to remove.
- Ingredient names are capitalized consistently, so "TURKEY" and "turkey" both display as "Turkey".

---

## Running it

```
javac *.java
java Main
```
