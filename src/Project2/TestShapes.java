package Project2;

// Testing code
public class TestShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}
