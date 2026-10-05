# Lab 4 -- Spheres!

**50 points**			

## Purpose:  

In this assignment, you will practice  creating a class and demonstrating its capabilities.

## Problem: 
A sphere is a rounded shape 3-dimensional object which has a center and a radius. In this assignment, you will define your Sphere class and use it to create sphere objects and to detect sphere collusion among all the spheres.

In computer games, spheres are used to model many spherical objects: the sun, the moon, the earth, a cannonball, a soccer ball, a baseball, a raindrop, etc... You will create a new class named Sphere (in **Sphere.java**.)

## Requirements:

It is up to you how to design the class but it needs to meet the following requirements:

1. All attributes (x,y,z, and radius) must be private.
2. A constructor that sets all the attributes to 0 (coordinate of the center and the radius) 
3. A constructor that sets the center and radius by accepting 4 double values (3 for the coordinate and 1 for the radius)
4. An accessor method for radius.
5. A mutator method for radius.
6. A toString method to help print out a Sphere object nicely.
7. A method to calculate the surface area of the sphere.
9. A **static** method to detect whether a sphere collides with another sphere (the spheres intersect).
10. A method of your choosing (Cannot be an accessor/mutator aka. getter/setter)

**The spheres are intersected if the distance between the centers is less than the sum of the two radii.** It is helpful to write out an algorithm for the check collusion method.

### Main:

**Main.java** already has some of the code that utilizes the Sphere class. You should add code to instantiate 2 more Sphere objects and test other methods.

## Quick note:
If you want a quick read about spheres go [here](https://byjus.com/maths/sphere/#:~:text=A%20sphere%20is%20a%20three,vertices%2C%20like%20other%203D%20shapes).

Complete the design of your Sphere class in *DESIGN.MD*. Each method in your class needs a name, access modifier, return type, and list of parameters (if any). 


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

3.  *Complete the design for your Sphere class* in **DESIGN.MD**. I need to see your design before you start coding. 

4.  *Code*: Your code should be in a **.java** file and follow your design/algorithm to write your code.

5.  *Fix compiler errors*: Run your program and fix any errors that appear.

6.  *Test:* Once your code runs and you think it’s complete, test it to see if it gets the right output. If not, you need to fix the error(s) in your code!

7.  Make sure you’ve created a human-readable essay (i.e. your program). Did you follow the code readability guidelines? If not, fix your code so that it is readable. You should have comments above each chunk of code!  Use white spaces to make your code more readable and lastly be consistent and considerate in naming your variables (**use camel Case style**)

8.  Once you are done in lab, even if you haven’t finished the assignment yet, you need to Commit and Push your changes.



## What to Submit:

1. Commit & Push your repository to **GitHub**. It should include DESIGN.MD and ..java with all code you write and the proper introductory comments at the very top and java doc style header for each method. Remember to add comments throughout your code. Go to GitHub.com to check that it worked.
2. Add a UML class diagram in png or pdf format of your Sphere class to GitHub.

3. Each partner should independently write a short (around 200 words) **reflection** of what you learned in Lab 4, what it was like making your own Java class, and working with their partner. What would you do differently Submit to **Moodle** under the Lab 4 assignment. (**This is part of your participation grade**)







