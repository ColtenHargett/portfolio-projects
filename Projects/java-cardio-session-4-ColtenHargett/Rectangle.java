public class Rectangle {
    // Fields
    double width;
    double height;

    
    // Add a default Constructor here
    public Rectangle(){
        width = 0;
        height = 0;
    }

    // Regular Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    // Returns the area of the rectangle
    public double area() {
        return width * height;

    }

    // Returns the perimeter of the rectangle
    public double perimeter() {
        return 2 * (width + height);

    }

    // Prints a summary of the rectangle
    public void describe() {
        System.out.println("Rectangle: " + width + " x " + height + " | Area: " + area() + " | Perimeter: " + perimeter());

    }
}
