/**
 * This is my code! It's goal is to test all four shape classes.
 * CS 312 - Lab 1
 * @author Colten and Megan
 * @version 1.0 9/14/2026
 */

public class Tester
{
    /**
     * Runs sample tests on Circle, Square, Hectogon, and RightTriangle.
     *
     * @param args command line arguments
     */
    public static void main(String [] args)
    {
        Circle circle = new Circle(Shape.Color.green, 5);
        System.out.println(circle);
        circle.paint(Shape.Color.blue);
        System.out.println(circle);

        Square square = new Square(Shape.Color.red, 4);
        System.out.println(square);

        Hectogon hectogon = new Hectogon(Shape.Color.blue, 2);
        System.out.println(hectogon);

        RightTriangle triangle = new RightTriangle(Shape.Color.green, 3, 4);
        System.out.println(triangle);
    }
}
