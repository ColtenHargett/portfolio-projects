/**
 * Anything that can calculate its own area and perimeter.
 */

public interface Geometry {

    /**
     * Calculates the area of the shape.
     *
     * @return area of the shape
     */
    double calculateArea();

    /**
     * Calculates the perimeter of the shape.
     *
     * @return perimeter of the shape
     */
    double calculatePerimeter();
}
