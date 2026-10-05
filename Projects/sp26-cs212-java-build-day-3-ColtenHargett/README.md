# Java Build Day 3: Restaurant Order Management System

---

## Project Overview

You are building a system for a busy restaurant kitchen. Orders are constantly coming in, and staff need a reliable way to manage them.

Your job is to design and implement a system that:

* Handles incoming customer orders
* Keeps track of what is being prepared
* Stores completed orders for later use
* Allows fast menu searching
* Organizes and sorts order data

This project is designed to help you think like a developer: making design decisions, choosing the right data structures, and building a system step by step.

[Here's an example of a Restaurant management system](https://www.youtube.com/watch?v=BL71mLQahGc)

---

## Problem Scenario

Imagine a fast-paced restaurant:

* Customers place orders continuously
* The kitchen prepares orders in the order they arrive
* Some orders may need priority (VIP)
* Staff need to quickly look up menu items
* Completed orders should be saved and possibly reused

Your system should model this real-world workflow.

---

## System Requirements

Your program must support the following:

### Core Features

* Load menu data from a file
* Display and search menu items
* Create customer orders
* Process orders through different stages
* Track completed orders
* Save order history to a file

### Order Flow

Orders should move through stages:

1. Waiting (just placed)
2. Active (being prepared)
3. Completed (finished and stored)

---

## Technical Constraints

To complete this project, your design must include:

* A structure optimized for **fast searching** (Hint, what structure did we JUST complete in class?)
* A structure that enforces **first-in, first-out behavior** 
* A structure that supports **last-in, first-out behavior**
* A structure that allows **efficient insertion and removal** (Keyword: efficient)
* A method to **sort orders efficiently**

You are responsible for choosing and implementing the appropriate data structures.

---

## Getting Started

### Step 1: Create Sample Data

Create a file called `menu.txt`.

Example format:

```
Burger,8.99,Entree
Fries,3.49,Side
Soda,1.99,Drink
Pizza,12.99,Entree
Salad,7.49,Entree
Chicken Tenders,9.99,Entree
Onion Rings,4.49,Side
Milkshake,4.99,Drink
Tacos,6.99,Entree
Ice Cream,3.99,Dessert
Coffee,2.49,Drink
Nachos,5.99,Side
Wings,10.99,Entree
Apple Pie,3.49,Dessert
Water,0.99,Drink
```

**Hints:**

* Each line represents one menu item
* You will need to split each line into parts
* Think about how to convert text into objects

---

## Development Milestones

Work through these milestones at your own pace.

---

### Milestone 1: Data Modeling

Design your core classes.

You will likely need:

* A class to represent menu items
* A class to represent orders

**Guiding Questions:**

* What information does a menu item need?
* What information does an order need?
* How will an order store multiple items?

**Hints:**

* Consider using an `ArrayList` for storing items in an order
* Think about how to calculate total price

---

### Milestone 2: Menu System

Load menu data and allow searching.

**Tasks:**

* Read from `menu.txt`
* Store menu items in a data structure
* Implement a way to search for items by name
* Display menu items

**Hints:**

* You will search the menu many times — efficiency matters
* Think about how data is organized internally
* How can you keep items sorted automatically?

---

### Milestone 3: Order Creation

Allow users to create orders.

**Tasks:**

* Create a new order
* Add items to an order
* Track order details (ID, items, total, etc.)

**Hints:**

* Update the total whenever an item is added
* Consider how you will uniquely identify each order

---

### Milestone 4: Order Processing Flow

Move orders through the system.

**Tasks:**

* Store incoming orders
* Process the next order
* Move orders to “active”
* Mark orders as completed

**Hints:**

* Real-world systems process orders in the order they arrive
* Some structures are designed specifically for this behavior
* Think about how to remove items safely

---

### Milestone 5: Order History

Track completed orders.

**Tasks:**

* Store completed orders
* Display recent orders
* Support a “reorder last order” feature

**Hints:**

* What does “most recent” mean in terms of data structure behavior?
* How can you look at the most recent item without removing it?

---

### Milestone 6: Sorting

Organize order data.

**Tasks:**

* Provide at least one way to sort orders
* Examples: by price, by ID, by priority

**Hints:**

* You can implement a sorting algorithm or use built-in tools
* Think about how two orders should be compared

---

### Milestone 7: File Output

Save completed orders to a file.

**Tasks:**

* Write order data to `order_history.txt`
* Include useful details (items, total, timestamp)

**Hints:**

* Use a file writer
* Format output so it is easy to read
* Always close your file

---

### Milestone 8: User Interface

Create a menu-driven program.

**Tasks:**

* Display options to the user
* Allow navigation between features
* Connect all parts of your system

**Hints:**

* Use a loop to keep the program running
* Use a `switch` statement for options
* Keep methods small and organized

---

## Testing Your System

### Self-Check

* [ ] Menu loads correctly from file
* [ ] Menu search works
* [ ] Orders can be created
* [ ] Orders move through all stages
* [ ] Completed orders are stored correctly
* [ ] Sorting works
* [ ] File output is generated

### Suggested Test Flow

1. Create an order with multiple items
2. Add it to the system
3. Process it
4. Complete it
5. View order history
6. Save to file

---

## Design Reflection (Required)

Answer these questions in comments or a separate file:

1. What data structures did you choose and why?
2. Where does your system prioritize efficiency?
3. What challenges did you encounter?
4. If your system had to handle thousands of orders, what would you improve?

---

## Evaluation Criteria

Your project will be evaluated based on:

* Correct functionality
* Appropriate use of data structures
* Code organization and readability
* File input/output implementation
* Problem-solving and design decisions
* Completion of design reflection

---

## Common Mistakes to Avoid

* Choosing the wrong data structure for the problem
* Not handling empty data structures
* Forgetting to update values (like total price)
* Not closing files properly
* Putting too much logic in one method

---

## Submission Requirements

Submit the following to Github:

- All Your code, including:

  * `MenuItem.java`
  * `Order.java`
  * `MenuBST.java` (or equivalent structure)
  * `RestaurantOrderSystem.java`
  * `menu.txt`
  * `order_history.txt` (if generated)

- Your reflection, covering: 
  
  * What data structures did you choose and why?
  * Where does your system prioritize efficiency?
  * What trade-offs did you make?
  * If the system scaled to 10,000 orders, what would break?
    
---

## Stretch Challenges (Optional)

* How can I implement priority handling for VIP orders?
* How can I allow removing items from the menu?
* Track statistics (average order, popular items)
* How can I Add estimated preparation times?


---

