/**
 * This is my code! It's goal is to define shared behavior for regular polygons.
 * CS 312 - Lab 1
 * @author Colten and Megan
 * @version 1.1 9/14/2026
 */

public class RegularPolygon extends Shape implements Geometry
{
    protected int sides;
    protected double sideLength;

    /**
     * Constructs a regular polygon with the given color, name, number of sides, and side length.
     *
     * @param color  color of the polygon
     * @param name   name of the polygon
     * @param s      number of sides
     * @param sl     length of each side
     */
    public RegularPolygon(Color color, String name, int s, double sl)
    {
        super(color, name);
        this.sides = s;
        this.sideLength = sl;
    }

    /**
     * Calculates the perimeter of the polygon.
     *
     * @return perimeter of the polygon
     */
    public double calculatePerimeter()
    {
        return sides * sideLength;
    }

    /**
     * Calculates the area of the polygon.
     *
     * @return the area of the polygon
     */
    public double calculateArea()
    {
        return 0.5 * calculatePerimeter() * (sideLength / (2 * Math.tan(Math.PI / sides)));
    }

    /**
     * Returns a string describing this polygon's color, name, area, and perimeter.
     *
     * @return a string
     */
    public String toString()
    {
        return super.toString() + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}
