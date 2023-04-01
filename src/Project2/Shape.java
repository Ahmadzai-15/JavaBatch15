package Project2;

public interface Shape {

/*   create an interface "Shape" with undefined methods as calculateArea and calculatePerimiter.
     create 2 class Circle and Square that implements functionality defined in the shape interface
*/
double calculateArea();
    double calculatePerimeter();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Square class implementing Shape interface
class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return sideLength * sideLength;
    }

    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}

