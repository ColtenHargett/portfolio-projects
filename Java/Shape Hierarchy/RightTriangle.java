/**
 * A right triangle, defined by its base and height.
 */

public class RightTriangle extends Shape implements Geometry
{
    private double base;
    private double height;

    /**
     * Constructs a right triangle with the given color, base, and height.
     *
     * @param color   color of the triangle
     * @param base    length of the triangle's base
     * @param height  height of the triangle
     */
    public RightTriangle(Color color, double base, double height)
    {
        super(color, "Right Triangle");
        this.base = base;
        this.height = height;
    }

    /**
     * Calculates the area of the right triangle.
     *
     * @return the area
     */
    public double calculateArea()
    {
        return 0.5 * base * height;
    }

    /**
     * Calculates the perimeter of the right triangle, including the hypotenuse.
     *
     * @return the perimeter
     */
    public double calculatePerimeter()
    {
        return base + height + Math.sqrt(base * base + height * height);
    }

    /**
     * Returns a string describing the triangle's color, name, area, and perimeter.
     *
     * @return a string
     */
    public String toString()
    {
        return super.toString() + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}
