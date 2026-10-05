/**
 * This is my code! It's goal is to create the Square class.
 * CS 312 - Lab 1
 * @author Colten and Megan
 * @version 1.0 9/14/2026
 */

public class Square extends RegularPolygon
{
    /**
     * Constructs a square with the given color and side length.
     *
     * @param color       color of the square
     * @param sideLength  length of each side
     */
    public Square(Color color, double sideLength)
    {
        super(color, "Square", 4, sideLength);
    }
}
