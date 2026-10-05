/**
 * A regular 100-sided polygon.
 */

public class Hectogon extends RegularPolygon
{
    /**
     * Constructs a hectogon with the given color and side length.
     *
     * @param color       color of the hectogon
     * @param sideLength  length of each side
     */
    public Hectogon(Color color, double sideLength)
    {
        super(color, "Hectogon", 100, sideLength);
    }
}
