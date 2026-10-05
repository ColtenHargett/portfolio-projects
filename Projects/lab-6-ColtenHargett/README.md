[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/18XJxGyi)
# CS 266 - Week 7 Lab

## Functions and Arrays in Bash

### Summary

In this lab, students will practice:  
1. Defining, calling, and passing arguments to functions  
3. Handling return values in functions
4. Creating, modifying, and iterating over arrays

---

## Task 1: One Argument Functions and $@  

Create a script named **task1.sh**.  

### Subtask 1.1

1. Define a function called `greet` that takes **one argument** (a name) and prints `Hello, <name>!`.  
2. Call the function inside your script three times with three different arguments. 


### Subtask 1.2

Modify your script in the following manner.

1. Create a for loop to iterate through ALL of the command line arguments.
2. For each command line argument, call `greet`.

### Example

```
./task1.sh Isaacman Ebert Nweke
Hello, Isaacman!
Hello, Ebert!
Hello, Nweke!
```

---

## Task 2: Multiple Arguments and shift
 
Create a script named **task2.sh**. 
 
### Subtask 2.1

1. Create a function named `introduction`.  
2. The function should accept **three arguments**: name, age, city.  
3. Inside the function, print:  
   ```
   My name is <name>, I am <age> years old and I am from <city>.
   ```  
4. In your script, call the function twice with different names and ages.  

### Subtask 2.2: Cycling Through Arguments with `shift`  

Modify your script in the following manner. You may assume that command line arguments come in sets of threes and you do not need to do error checking.


1. While there are command line arguments remaining.  
    1. Send the first three command line arguments to `introduction`
	2. Shift the command line arguments down three times.

### Example 

```
./task2.sh Amina 26 Cairo Hiroshi 33 Tokyo Sofia 41 "Buenos Aires" Samuel 28 Lagos
My name is Amina, I am 26 years old and I am from Cairo.
My name is Hiroshi, I am 33 years old and I am from Tokyo.
My name is Sofia, I am 41 years old and I am from Buenos Aires.
My name is Samuel, I am 28 years old and I am from Lagos.
```

---

## **Task 3: Arrays in Bash**  

Create a script named **task3.sh**.

### Subtask 3.1: Declaring and Accessing Arrays  
1. Declare an array named `fruits` with `"apple" "banana" "cherry"`.  
2. Print the second element.
3. Print the **number of elements**.


### Subtask 3.2: Looping Through an Array  
1. While the array has less than 6 elements in it.
    1. Tell the user all of the current fruits.
    2. Ask the user for a new fruit to add to the list
    3. Add the user's chosen fruit to the list. 	

### Subtask 3.3: Exploring Quotes in Arrays 
1. Once the user has typed in all their fruits. Use a for loop to print the whole list, one on each line.
2. Create **task3.txt** using script. Demonstrate that your code works given the following inputs: "Dragon Fruit" "Star Fruit" and "Passion Fruit".

### Example

```
./task3.sh
Current Fruits:
apple banana pear
Next fruit? Passion Fruit

Current Fruits:
apple banana pear Passion Fruit
Next fruit? Star Fruit

Current Fruits:
apple banana pear Passion Fruit Star Fruit
Next fruit? Dragon Fruit

All Fruits:
apple
banana
pear
Passion Fruit
Star Fruit
Dragon Fruit
```

---

## Submission

1. Commit your scripts and demos (`task1.sh`, `task2.sh`, `task3.sh`, `task3.txt`) to GitHub. 
2. Write and commit `reflection.txt` answering:  
   - What did you find easy/difficult about functions and arrays?  
   - Where might it be useful to have arrays in your scripts?
   - Are there functions you might alias in your .bash_profile?   

 
