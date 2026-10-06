# Gradebook

A small gradebook that stores grades for a class of students and reports each student's average and highest grade.

Built with a classmate.

---

## Overview

The program asks for each student's name and five grades, can sort each student's grades, and then prints the class averages and each student's top grade.

---

## How It Works

- **An array of Student objects** holds the class, and each Student keeps its own array of grades.
- **Insertion sort** puts a student's grades in ascending order.
- **Guards against bad input:** adding a grade to a full gradebook prints a message instead of overflowing, and a student with no grades averages to 0 instead of dividing by zero.

---

## Running it

```
javac *.java
java Main
```
