# Lab 5 -- Grades And Students System (GASS)

## Purpose
This lab will give students the opportunity to practice

* Classes  
* Arrays  
* Loops  
* NumberFormat
* Sorting  

## Problem
You have been tasked with rewriting the (somewhat suspect) Moodle gradebook and replace it with 
the Grades And Students System (GASS).

## Requirements
You need to develop a `Student` class. When a `Student` is created, it should start with a **name** and a maximum number 
of grades that will be allowed to be entered. The user of the Student class should be able to add a grade to the student
as long as they have not added more than the maximum number of grades. A user can choose to sort the grades in ascending order.
Additionally, a user should be able to find the  maximum grade for a student.
Finally, when a student is displayed, it should show the student's name and their grade average.

## Design
The student class should have *at minimum* the following attributes (make them private):
* name
* an integer array of grades.

The student class should have *at minimum* the following methods:
* A constructor that takes a name and a max number of grades.
* A method to add **a grade** to a Student.
* A method to sort the grades
* A method to find the max grade for a student.
* A toString or display method that prints the student's name and their average.

**NOTE:** It is very likely that you will need at least one other attribute and method to support what you are doing (look below). 

## Use Case
You have been provided with Main.java to make use of your `Student` class. However, the file is incomplete. Address the
TODO fields such that GASS does the following:
1. Asks the user for the name of each student.
2. Asks the user to input grades for each student.
3. Asks whether the user wants to sort the grades of the student, if yes, sort and print out the grades
3. When done, prints out the full class roster including the student's name and average for the student.
4. Prints out the single highest grade from each student (along with their name) in the class.

## Test Cases:
Create 3 test cases for your program based on the above use case, put them in **testcases.txt**

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
2. A drawing of your class diagram (in pdf or png format)
3. *testcases.txt* containing at least 3 test cases.
4. All of your code with javadoc.

To Moodle, one per person:
1. A short reflection addressing at least the following:  
    * Are you getting more comfortable with classes?  
    * What was hard/easy about working with arrays and sorting?
    * Was it helpful to have the starter code in Main, or not necessary?
    * How was it working with your partner?
