## Class overview

Point is the abstract base class both point types share. It just holds a color and a name as strings, takes them in the constructor, and leaves toString() abstract since Cartesian and Polar points obviously print differently.

Two interfaces:
- Translatable — one method, translate(double byX, double byY)
- Rotatable — one method, rotate(double thetaDegrees)

CartesianPoint extends Point and implements both interfaces, with x and y as its fields.

PolarPoint extends Point and also implements both interfaces, with theta and rho as its fields. PolarPoint.translate() converts itself to a CartesianPoint, calls translate on that, and converts the result back. rotate() adds the degrees to theta and wrap it back into [0, 360)

## Milestones

1. Write the Translatable interface — translate(double byX, double byY).
2. Write the Rotatable interface — rotate(double thetaDegrees).
3. Write the abstract Point class — color/name fields, constructor, getters, abstract toString().
4. Start CartesianPoint extends Point.
5. Give it x and y fields plus a constructor.
6. Get toString() working.
7. Implement Rotatable — convert degrees to radians before calling Math.cos/Math.sin.
8. Implement Translatable — just add byX/byY to x/y.
9. Start PolarPoint extends Point.
10. Give it theta and rho fields plus a constructor.
11. Get toString() working.
12. Implement Rotatable — add the degrees to theta, then normalize back into [0, 360).
13. Write private helpers to convert PolarPoint to and from a CartesianPoint.
14. Implement Translatable using conversion helpers.
15. Write Tester.java and hard code every test.

## Test plan

Rotation always converts degrees to radians first.

### CartesianPoint

1. Basic create and print. new CartesianPoint("red", "P1", 3, 4) -> P1: (3.0, 4.0) red. Just making sure the constructor and toString() agree with each other.
2. Translate by (2, -1). (3, 4) -> (5.0, 3.0). Checks that translate adds correctly, including a negative.
3. Translate by (0, 0). (3, 4) -> (3.0, 4.0). Check that nothing weird happens with zeros.
4. Rotate 90 degrees. (1, 0) -> ~(0.0, 1.0). Tests the rotation formula is right.
5. Rotate 0 degrees. (3, 4) -> (3.0, 4.0) Makes sure nothing weird happens with zeros.
6. Rotate 180 degrees. (1, 0) ->  ~(-1.0, 0.0). Makes sure the signs flip the right way for a half turn.
7. Rotate then translate. (1, 0), rotate 90 degrees then translate (2, 2) -> ~(2.0, 3.0). Confirms the two interfaces actually work together.
8. Negative coordinates. new CartesianPoint("blue", "P2", -3, -4) -> P2: (-3.0, -4.0) blue. Nothing should break on negative numbers.

### PolarPoint

1. Basic create + print. new PolarPoint("green", "Q1", 45, 2) -> Q1: (45.0, 2.0) green. Confirms print works well.
2. Rotate by 90 degrees. theta=45, rho=2 -> theta=135.0, rho=2.0. Rotate should only ever touch theta.
3. Rotate past 360 degrees. theta=350, rotate(30) -> theta=20.0. Proves that it should wrap around instead of exceeding 360 degrees.
4. Rotate by a negative angle. theta=45, rotate(-45) -> theta=0.0. Checks it handles negative input.
5. Translate along the same axis its already on. theta=0, rho=1, translate(1, 0) -> theta=0.0, rho=2.0. Checks simple translation.
6. Translate to somewhere off axis. theta=90, rho=1, translate(1, 0) -> theta≈45.0, rho≈1.414. Checks a more complicated translation works.
7. Translate through the origin and out the other side. theta=0, rho=5, translate(-10, 0) -> lands at Cartesian (-5,0), which should come back as theta=180.0, rho=5.0, not a negative rho. Checks to see if the conversion helper isn't flipping theta by 180 degrees for a negative x.
8. Color and name on PolarPoint. new PolarPoint("blue", "Q2", 30, 3) -> Q2: (30.0, 3.0) blue. Confirms the inherited Point fields arent somehow broken for the polar case.
