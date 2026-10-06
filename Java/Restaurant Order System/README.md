# Restaurant Order System

A command-line ordering system for a small restaurant: look up menu items, take orders, send them to the kitchen, and keep a history of everything that's been served.

The goal was to use the right data structure for each part of the job, instead of putting everything in one big list.

---

## Overview

An order moves through three stages, and each stage is stored in the structure that fits how it gets used:

| Stage | Structure | Why |
|---|---|---|
| Menu | Binary search tree | Fast lookups by name, and an in-order walk prints the menu alphabetically |
| Waiting | Two queues (VIP and regular) | First come, first served, but VIP orders skip the line |
| Cooking | Linked list | Orders are added at the back and finished from the front |
| Completed | Stack | The most recent order is always on top, which makes "reorder last" one step |

---

## Features

- Loads the menu from `menu.txt` into a binary search tree
- Case-insensitive menu search
- Builds orders item by item, with an optional VIP flag
- Processes VIP orders before regular ones
- Moves orders from waiting → cooking → completed
- Reorders the last completed order with one option
- Sorts completed orders by total
- Saves the full order history (with every item) to `order_history.txt`

---

## Files

- `MenuItem.java` – a single menu item (name, price, category)
- `MenuBST.java` – the binary search tree that stores the menu
- `Order.java` – an order, its items, status and total
- `RestaurantOrderSystem.java` – the menu loop and order flow
- `menu.txt` – sample menu data (`name,price,category`)

---

## Running it

```
javac *.java
java RestaurantOrderSystem
```
