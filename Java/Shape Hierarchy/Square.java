/**
 * A square, built on RegularPolygon.
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
