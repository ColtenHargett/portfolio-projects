# Sphere class

## Attribute
Access Modifier: private
Type: double
xCoordinate 
yCoordinate
zCoordinate
radius

Purpose:
These variables store the center of the sphere in 3D space (x, y, z) and the radius of the sphere.
They are private so they cannot be accessed directly from outside the class.
## Constructor
**Default Constructor**

Access Modifier: public
Name: Sphere
Parameters: none
Return Type: none

Algorithm:
1.	Set xCoordinate to 0
2.	Set yCoordinate to 0
3.	Set zCoordinate to 0
4.	Set radius to 0

**Parameterized Constructor**

Access Modifier: public
Name: Sphere
Parameters: double x, double y, double z, double r
Return Type: none

Algorithm:
1.	Set xCoordinate to x
2.	Set yCoordinate to y
3.	Set zCoordinate to z
4.	Set radius to r

## Methods
getRadius

Access Modifier: public
Return Type: double
Parameters: none

Algorithm:
1.	Return radius

----------------------

setRadius

Access Modifier: public
Return Type: void
Parameters: double r

Algorithm:
1.	Set radius to r

----------------------

toString

Access Modifier: public
Return Type: String
Parameters: none

Algorithm:
1.	Return a formatted string showing:
      •	Position: (xCoordinate, yCoordinate, zCoordinate)
      •	Radius: radius units

----------------------

calculateSurfaceArea

Access Modifier: public
Return Type: double
Parameters: none

Algorithm:
1.	Compute surfaceArea = 4 × π × radius²
2.	Return surfaceArea

----------------------

calculateVolume

Access Modifier: public
Return Type: double
Parameters: none

Algorithm:
1.	Compute volume = (4/3) × π × radius³
2.	Return volume

----------------------

collidesWith

Access Modifier: public static
Return Type: boolean
Parameters: Sphere s1, Sphere s2

Algorithm:
1. Compute the distance between the centers using:
   distance = √[(x1 − x2)² + (y1 − y2)² + (z1 − z2)²]
2. Compute sumOfRadii = s1.getRadius() + s2.getRadius()
3. If distance is less than sumOfRadii
   return true
4. Otherwise
   return false