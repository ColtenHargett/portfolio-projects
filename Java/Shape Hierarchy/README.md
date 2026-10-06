# Shape Hierarchy

A small class hierarchy for 2D shapes that shows when to use inheritance and when to use an interface.

Built with a classmate.

---

## Overview

```
Shape                      (color + name)
├── Circle                 implements Geometry
├── RightTriangle          implements Geometry
└── RegularPolygon         implements Geometry
    ├── Square             (4 sides)
    └── Hectogon           (100 sides)
```

- **Shape** holds what every shape has: a color and a name.
- **Geometry** is an interface that requires `calculateArea()` and `calculatePerimeter()`.
- **RegularPolygon** does the math for any shape with equal sides, so `Square` and `Hectogon` only pass in their number of sides. No formulas are written twice.

---

## Design choices

- **Inheritance for shared state, interfaces for shared behavior.** Every shape has a color, so that lives in the base class. Each shape calculates area differently, so that's a contract each class fills in.
- **`protected` color.** Subclasses can repaint a shape, but nothing outside the hierarchy can change it directly. It's a middle ground between `private` and `public`.
- **A color enum** keeps colors limited to valid values.

We drew the class diagram before writing any code, which made it clear early which logic could be shared.

---

## Running it

```
javac *.java
java Tester
```
