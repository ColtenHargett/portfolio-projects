/**
 * This is my code! It's goal is to define the behavior of the shape class.
 * CS 312 - Lab 1
 * @author Colten and Megan
 * @version 1.0 9/14/2026
 */

public class Shape
{
    public enum Color {red, blue, green};

    protected Color color;
    protected String name;

    /**
     * Constructs a shape with the given color and name.
     *
     * @param c  color of the shape
     * @param n  name of the shape
     */
    public Shape(Color c, String n)
    {
        color = c;
        name = n;
    }

    /**
     * Changes the color of the shape.
     *
     * @param newColor  the new color to paint the shape
     */
    public void paint(Color newColor)
    {
        color = newColor;
    }

    /**
     * Returns a string describing this shape's color and name.
     *
     * @return a string
     */
    public String toString()
    {
        return "This " + color + " " + name;
    }
}
