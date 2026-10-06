# To-Do List

A command-line to-do list. Add tasks anywhere in the list, check them off, remove them, or clear everything.

Built with a classmate.

---

## Overview

```
1. Add an item in the middle.
2. Add an item at the end.
3. Remove an item.
4. Mark an item as done.
5. Clear the list.
0. Quit
```

---

## How It Works

- **ToDoList** wraps an `ArrayList<String>` and gives it to-do-specific methods like `markAsDone`.
- **Overloaded `addItem`**: one version adds to the end, and the other inserts at a specific position.
- **Range checks** on every position the user types, so an invalid number prints a message instead of crashing.

---

## Running it

```
javac *.java
java Main
```
