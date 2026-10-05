# Sphere Collisions

A `Sphere` class for 3D shapes like the ones games use for planets, balls or raindrops. It calculates surface area and volume and detects when two spheres collide.

Built with a classmate.

---

## Overview

Each sphere has a center `(x, y, z)` and a radius. The demo creates a sun, an earth, a moon and a few test spheres, then prints their measurements and checks for collisions.

---

## How It Works

- **Surface area** = 4πr² and **volume** = (4/3)πr³.
- **Collision:** two spheres overlap when the straight-line distance between their centers, √(Δx² + Δy² + Δz²), is less than the sum of their radii.
- **Encapsulation:** coordinates are private, with getters and a setter for the radius, and a default constructor that builds a zero-sized sphere at the origin.

---

## Running it

```
javac *.java
java Main
```
