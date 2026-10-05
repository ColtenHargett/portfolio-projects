# Lab 7- Get It Done 

## Purpose
This lab will give you practice with:
1. Using Array Lists
2. Processing User Input

## Problem
The demands on your time are getting rather pressing and you need a ToDo list to help you out.

## Requirements
The application should print out a numbered list of the tasks on the ToDo list and then print out the following menu:
```
What would you like to do?
1. Add an item in the middle.
2. Add an item at the end.
3. Remove an item.
4. Mark an item as done.
5. Clear the TODO list.
0. Quit
```

Menu options 1 and 2 both add items to the list. The difference is that only menu option 1 should ask where the new item
should be placed. The new item's number must be either an existing number (shifting the rest of the list to the right) or should
be 1 greater than the largest number currently on the list (in which case it adds to the end, as in option 2.)

Menu option 3 removes an item from the list. The user specifies which item number to remove and all other items shift
to the left.

Menu option 4 marks an item as done however you choose. For instance, changing the value of the item to have the word DONE in
front of it. The original content of the item must still be a part of the item. **The user specifies which item to
mark as done by number.**

Menu option 5 will clear the TODO list.

Since this it to be used by the general public, **all lists should start with 1 instead of 0 when you print out the list.**

### Error checking
You do not have to check that user typed in a number. However, you do need to ensure that the user enters a valid menu
item (in `Main`) and selects a valid spot in the list (should be done in the `ToDo class` i.e. ignore the request if it is out of bounds).

## Design
You have been provided with a skeleton of `Main`.

Your `ToDoList` class should use an ArrayList to store the list and **methods** that support all the requirements. It also needs a `toString()` method.

Show the instructor the Design before you start coding.



## Testing
You should produce *testcases.txt* containing at least 5 testcases that include input,
output, and a description. If the test case needs setup, be sure to include that in the input.

## STYLE
You are expected to follow a consistent style. Pay particular attention to:

1. File headers: You should have a file header at the top of every file explaining the purpose and author of the file, describing input/output if any.
    It must start with (replace the bits in < >):  
    ```java
    /**
    * This is my code! It's goal is to <give purpose of file here>
    * CS 212 - Lab <#>
    * @author <Your Name> <Your partner name>
    * @version <a version number followed by a date>
    */
    ```
2. Variable names: use meaningful names in all camelCase style
3. Your code should have appropriate whitespace and avoid overly long line lengths.
4. Use clear documentation and careful formatting. Be consistent in the indentation and alignment of braces.
5. Every method in your class must have a header comment of the form (replace the bits in < > and only use the number of `@param` that are needed for your method):  
    ```java
    /**
    * <A one sentence description of the method, ending with a period.>
    * <Optional longer description if desired>
    *
    * @param  <first parameter name>  <purpose of the parameter>
    * @param  <second parameter name>  <purpose of the second parameter>
    * @return      <what is returned>
    */
    ```
6. Your code should have no compilation errors.
7. Use of git: use meaningful commit messages and commit after reasonable milestones (i.e., a function has been completed)
    * A single commit for the whole project is not a good use of git

## Reminders: 

You will write your program in the "pair programming" mode: one of you is the driver while the other is the navigator.

1.  Make sure you *understand the problem* you are being asked to solve. What are the input(s), output(s), and calculation(s)?

3.  *Complete the design for your class* in **DESIGN.MD**. I need to see your design before you start coding. 

4.  *Code*: Your code should be in a **.java** file and follow your design/algorithm to write your code.

5.  *Fix compiler errors*: Run your program and fix any errors that appear.

6.  *Test:* Once your code runs and you think it’s complete, test it to see if it gets the right output. If not, you need to fix the error(s) in your code!

7.  Make sure you’ve created a human-readable essay (i.e. your program). Did you follow the code readability guidelines? If not, fix your code so that it is readable. You should have comments above each chunk of code!  Use white spaces to make your code more readable and lastly be consistent and considerate in naming your variables (**use camel Case style**)

8.  Once you are done in lab, even if you haven’t finished the assignment yet, you need to Commit and Push your changes.


## Submission
To GitHub, one per team:
1. *DESIGN.MD* containing the design of your class.
2. An UML drawing of your class diagram
3. *testcases.txt* containing at least 3 test cases.
4. All of your code.

To Moodle, one per person:

* A reflection that answers at least the following questions:
  * How was working with ArrayLists similar to working with arrays?  
  * How was it different?  
  * What did you learn working on this assignment?
  * How did this assignment compare to recent labs?
  * What was it like working with your partner?
