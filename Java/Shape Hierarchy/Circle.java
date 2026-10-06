/**
 * A circle, defined by its radius.
 */

public class Circle extends Shape implements Geometry {
    private double radius;

    /**
     * Constructs a circle with the given color and radius.
     *
     * @param color    color of the circle
     * @param radius   radius of the circle
     */
    public Circle(Color color, double radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter of the circle.
     *
     * @return the perimeter
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns a string describing the circle's color, name, area, and perimeter.
     *
     * @return a string
     */
    public String toString() {
        return super.toString() + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}
