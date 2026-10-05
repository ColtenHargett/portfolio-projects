# CS312 Assignment 2 - Meet the band 

**This assignment is worth 100 points: Initial Design (30 points), Update Design and Implementation (70 points).**

## Problem
A client has requested that you come up with a program to store and retrieve information about their favorite musical act.

## Goals
In this assignment, you will practice
1. Proper design (i.e., who does what task)
2. Generics (optional)
3. Java Collection Framework
4. Manipulating Command Line Interfaces


## Analysis
Your client needs a program that can output information about their
favorite band. The program must be able to:
* take options as *command-line arguments* with no other user input
* print the entire band, including its name
* find and print a band member with a given name
* find and print a band member who plays a given instrument

If your program is called with no arguments or incorrect arguments, it should print out a usage message as follows: 
```
    Usage: java Driver [-p|-n|-i] <options>
      -p               (print)
      -n <name>        (lookup by member name)
      -i <instrument>  (lookup by instrument)
```

## Design
* Your code should have at least the following classes (each class should be in its own file):
    * `BandMember`  
    * `Band`  
    * `CLI` (i.e., Command Line Interface)
    * `Driver`
        * `main()` should be here
* `main()` should populate the band before creating a `CLI` object to process the command line arguments.
* Test your program with your favorite band.
    * As an example:  
        ```java
        Band theBeatles = new Band("The Beatles");
        theBeatles.add( new BandMember("John Lennon", "vocals"));
        theBeatles.add( new BandMember("Paul McCartney", "bass"));
        theBeatles.add( new BandMember("Ringo Starr", "drums"));
        theBeatles.add( new BandMember("George Harrison", "guitar"));
        // System.out.println("The Beatles = " + theBeatles);  // for ``testing''
        ```
* Turn in your Design and Test cases in **DESIGN.MD**. It should include
  
  1. A class diagram (no hand drawing) of all your classes (not Driver class) with any relationship between them. (Add a jpg or png file to GitHub), and include it in **DESIGN.MD** (look up how to do it in markdown language)
  2. **DESIGN.MD**  should have a narration of your classes under *Class Hierarchy**. This should reflect your class diagram. Each class should have attributes (if any), and methods (including constructor(s)). It is essential to provide a concise sentence describing the purpose of the method.
  3. Test cases: What is your favorite band? You can use it to test out your program.

## Implementation
* You must use use of JCF `Iterator` (not the for each loop version)
* Use generics (optional). Band may include other objects that are derived from BandMember. For example, LeadMember is a lead vocalist or a lead guitarist. 

## Bonus
**5 additional points** if your program can handle `-i` option that gets **all the band members** that play an instrument (i.e. don't stop at the first one that matches)

**5 additional points** if your Band class uses generics properly.


## Stylistic Requirements and Notes
In any company, you will be required to adhere to particular stylistic conventions. Such is true here to. Please ensure that your code adheres to the following.
1. Separate jobs meaningfully. For instance, `CLI` should do all output, no other class (with the *possible* exception of `Driver`) should output to the screen.
1. Error checking is required.
1. Each source code file must start with (replace the bits in < >):  
    ```java
    /**
    * This is my code! It's goal is to <give purpose of file here>
    * CS 312 - Assignment 2
    * @author <Your Name>
    * @version <a version number followed by a date>
    */
    ```
2. Use clear documentation and careful formatting. Be consistent in indentation and alignment of braces.
3. Every method must have a header comment of the form (replace the bits in < > and only use the number of `@param` that are needed for your method):  
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
4. Your code must compile with no warnings using ``javac *.java -encoding UTF-8 -source 8 -target 8 -Xbootclasspath/p:/usr/local/java/jre/lib/``
5. Avoid wildcards in imports such as import ``java.util.*``
6. Your code can contain no more than one static method.
7. Avoid the use of the ``instanceof`` keyword. True OO thinking should not require it.
8. Declare attributes private for now, we will do things better later.
9. All concrete classes must include reasonable `toString` methods.
10. Your code should contain ***no*** `get()` or `set()` methods.
11. Be mindful of line breaks in your code. To see how your code will look to me, run:
    ```bash
    a2ps -T 4 -q -Avirtual -2 -o mycode.ps *.java
    ps2pdf mycode.ps
    xpdf mycode.pdf
    ```
12. Do *not* commit derivable files such as `.class` files.

 ***Remember to double check on github.com that your files pushed. If they didn’t, you need to push them. I can only see what is on github.com, not what is only on your computer.***
 
## Submission
To GitHub:
1. Your Java Source Code with `main` in `Driver.java`.
2. DESIGN.md with the design decision: classes and their hierarchy, test cases.
3. An updated DESIGN.md with a `## Reflection` section containing a general reflection on the project
