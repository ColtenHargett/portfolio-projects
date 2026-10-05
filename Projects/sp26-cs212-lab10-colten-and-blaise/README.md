# Lab 10 -- Smart Contacts (Scaffolded Linked List)

## Purpose

The goal of this assignment is for you to implement your **own sorted linked list** to store a simple phonebook.

This lab will give you practice with:

* Linked lists (building one from scratch)
* Node-based data structures
* String comparison
* Traversing and modifying a linked structure

---

## Description

Write a Java program that supports a **sorted linked list of Contact objects**.

Your program will act as a simple phonebook where:

* Contacts are stored in a linked list
* The list is always kept **in alphabetical order by name**
* The user can:

  * Add a contact
  * Remove a contact
  * Print all contacts

You will be given **scaffolded code** and will complete the missing parts.

---

## Details

You will need to implement the following classes:

---

### Contact class

The **Contact** class has 2 attributes (instance variables):

* `name`
* `phone`

You must complete:

* A constructor
* Getter method(s)
* `toString()`
* `compareTo(Contact other)`

A **Contact** object is greater than another if its **name comes later alphabetically**.

*Note: You should use the `compareTo()` method from the String class inside your implementation.*

---

### Node class

The **Node** class represents a single element in your linked list.

Each node stores:

* A **Contact object**
* A reference to the **next node**

You must complete the constructor.

---

### SortedLinkedList class

This class represents your linked list.

It has one instance variable:

* `head` (the first node in the list)

You must complete the following methods:

* `add(Contact newContact)`

  * Inserts a contact in the correct position so the list remains sorted

* `remove(String name)`

  * Removes a contact by name

* `toString()`

  * Returns a string representation of all contacts in order

---

### Main class

The **Main** class provides a simple menu for interacting with your linked list.

You must:

* Create Contact objects
* Call `add()`
* Call `remove()`
* Print the list

A scaffolded version of `main` has been provided.

---

## Implementation Notes

### Adding (Most Important Part)

Your `add()` method must handle **three cases**:

1. The list is empty
2. The new contact should be inserted at the front
3. The new contact should be inserted somewhere in the middle or end

You will need to **traverse the list** to find the correct position.

---

### Removing

Your `remove()` method must handle:

1. Removing from an empty list
2. Removing the head
3. Removing from the middle or end

---

### Traversal Pattern

You will frequently use this pattern:

```java
Node current = head;
while (current != null) {
    current = current.next;
}
```

---

## Testing

You should test your program by:

* Adding multiple contacts
* Ensuring they print in sorted order
* Removing contacts from:

  * The front
  * The middle
  * The end

### Sample Test Data

```
Hoang 793
Denzel 457
Dave 412
Loki 841
Carl 928
Miko 813
Carly 542
David 741
```

---

## Design

Since the class structure is provided, you must:

1. Draw UML class diagrams for:

   * Contact
   * Node
   * SortedLinkedList

2. Write pseudocode for the `add()` method in **algorithm.txt**

Your pseudocode should clearly describe:

* How you traverse the list
* Where and how insertion happens

---

## STYLE

You are expected to follow a consistent style. Pay particular attention to:

**File headers:**
You should have a file header at the top of every file explaining the purpose and author of the file, describing input/output if any.

It must start with (replace the bits in < >):

```java
/**
* This is my code! It's goal is to <give purpose of file here>
* CS 212 - Lab <#>
* @author <Your Name> <Your partner name>
* @version <a version number followed by a date>
*/
```

**Variable names:**
Use meaningful names in camelCase style

**Formatting:**

* Use appropriate whitespace
* Avoid overly long lines
* Be consistent with indentation and braces

**Method headers:**
Every method must include a comment like:

```java
/**
* <A one sentence description of the method, ending with a period.>
*
* @param  <parameter name>  <purpose>
* @return <what is returned>
*/
```

**Code quality:**

* No compilation errors
* Clean, readable code

**Git usage:**

* Use meaningful commit messages
* Commit after completing logical parts (not all at once)

---

## Reminders

You will work in **pair programming mode**:

* One person is the driver
* One person is the navigator

Make sure you:

* Understand the problem before coding
* Complete your **algorithm.txt** before implementing `add()`
* Follow your design when coding
* Fix all compiler errors
* Test thoroughly
* Write clean, readable code

Even if unfinished, you must **commit and push your work** at the end of lab.

---

## Checkpoints

To stay on track, aim to complete:

* Contact and Node classes compile
* Add one contact and print
* Add multiple contacts in sorted order
* Remove a contact
* Full program works with menu

---

## Submission

### To GitHub (one per team):

* `algorithm.txt` for the `add()` method
* All `.java` files

---

### To Moodle (one per person):

A reflection that answers:

* How you feel about linked lists after this lab
* What the most challenging part was
* How it was working with your partner

---
