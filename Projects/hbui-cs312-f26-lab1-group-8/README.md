# CS312 - Lab 1 - Getting into Shape

## Goals
In this lab, you will practice:

1. Inheritance
2. Interface
3. Illustrate your design through a class diagram
4. Work with git from the command line (You may see conflict - see **see git merge below**)

## Problem
Donald Duck is stuck in Mathmagic land and needs help navigating all the floating shapes.

## Analysis
1. You must create a program that can keep track of four different shapes:
    * Squares
    * Hectogons
    * Circles
    * Right Triangles
2. Each shape has a color.
3. Squares (4 sides) and Hectogons (100 sides) are "regular polygons" and each has a side length.
4. Circles have a radius.
5. Right triangles have a base and a height.
6. Square, Hectogon, Circle and Right Triangle ojects should be named `Square`, `Hectogon`, `Circle`, and `Right Triangle respectively.
7. All four shapes (Square, Hectogon, Circle, Right Triangle) should be able to change color (already implemented), and calculate their area and perimeter.
8. **Important**: Discuss with your partner to draw a class diagram on paper to structure your code before implementing. **Think about Inheritance and Interface.**. 

**Remember, a class can extend another class and implement an interface**

``
public class ChildClass extends ParentClass implements AnInterface
``

## Hints for your Design
1. `RegularPolygon` **is-a** `Shape` (already implemented)
2. `Circle` **is-a** ?
3. `RightTriangle` **is-a** ?
4. `Square` **is-a** ?
5. `Hectogon` **is-a** ?
6. What should you put in the `interface`?
7. Which classes should implement the `interface`?
8. `Tester` should test your code (all four shapes) 
9. The `toString` method of the four shapes (Square, Hectogon, Circle, Right Triangle) should print its color, name, area, and perimeter



**Show the instructor the design (UML class diagram) before implementation**

## Useful Math
from https://www.wikihow.com/Calculate-the-Area-of-a-Polygon
For a regular polygon
```
area = 0.5 * perimeter * apothems
```
where
```
apothems = sideLength / (2 * tan(pi/number of sides))
```


## git merge conflicts and what to do
In the event that a push fails due to a conflict:
1. Do a git pull to get the updated files.
    * This may have "automerged." If so:
        1. Save/edit commit message (`:wq` to save and quit)
        2. `git push`
        3. You are done, ignore other steps.
3. Look in the failure message to see which files failed.
4. Edit those files with vi.
    * You will see the text from both versions with "<<<<<<<" showing what comes from where.
    * Edit the file so it looks how you want it to look (Look at the vi cheatsheet to make this easier. There are commands for copy/paste as well as deleting whole lines.)
    * `git add` any files that you edited.
    * `git commit -m ` again with a reasonable commit message after the `-m`. Note: **Do not** put the names of the files you added or you will get a "partial merge" failure.
    * `git push`
## Stylistic Requirements and Notes

1. Classes and interfaces should have their own files.
2. Each source code file must start with (replace the bits in < >):  

```java
/**
* This is my code! It's goal is to <give purpose of file here>
* CS 312 - Lab 1
* @author <Your Name>
* @version <a version number followed by a date>
*/
```
3. Use clear documentation and careful formatting. Be consistent in indentation and alignment of braces.
4. Every method must have a header comment of the form (replace the bits in < > and only use the number of `@param` that are needed for your method):  

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

## Submit
To GitHub:
1. All your .java files (remember each class needs its own file.
    * Comments ahead of each class should name who was involved in the writing of each class.
2. **A UML class diagram** representing your class hierarchy using Google Draw or a similar tool (No drawing by hand) exported to png or jpg format. 

To Moodle:
A short reflection including:
1. How a class hierarchy helped you structure your code.
2. What does it mean that `color` is "protected"?
3. What happens when you remove `super(color, name);` from the `RegularPolygon` constructor?
4. Any problems that you ran into, particularly with git.
5. General thoughts on what you learned in the lab.
6. How well or poorly did pair programming work here for you?
