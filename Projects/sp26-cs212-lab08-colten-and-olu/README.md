# SP26-CS212-Lab08

# Lab 8 - Byte Me Book Store  

## Purpose
This lab will give you practice with:
1. Using Array Lists/HashMap
2. Processing Input from a file
3. Error handling

## Problem
You are hired to digitize a bookstore. Their inventory is stored in a file **books.txt** with the title and the price.

## Requirements
You need to design a BookStore class to store the inventory in a data structure of your choosing. Your class should support the following use cases from a Main/Driver.

The Main/Driver should print out a welcome message then, read in the inventory from **books.txt**.
After that, it should let the user choose what to do

```
Here are the options:
1. List all books
2. List all books that are cheaper than the chosen price
3. Add a new book
4. Update the price of a book
5. Remove a book
6. Find a book by title
7. Quit
```

Option 2 asks the user for the price.

Options 3 and 4 ask the user for the title and the price.

Option 5 asks the user for an exact title i.e. "The Silent Code"

Option 6 asks for a string and matches the string with titles. i.e. "code" will show both "The Silent Code" and "Codebreaker's Legacy"

## Error checking
You do need to check that the user typed in a number. Your program should not crash if the user mistypes.
If there is no **books.txt** the inventory should be empty.


## Design

You will start by designing your `BookStore` class. Show the instructor the design before coding.


## Hint
You should read the file one line at a time and use the [`split`](https://docs.oracle.com/javase/9/docs/api/java/lang/String.html#split-java.lang.String-
) method from the String class to tokenize the fields:



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
2. An UML drawing of your class diagram ( whimsical.com // draw.io // paper and pencil )
3. All of your code.

To Moodle, one per person:

* A reflection that answers at least the following questions:
  * What is the reasons you choose a particular data structure?  
  * What is the most useful thing you learn working on this assignment?
  * What was it like working with your partner?
