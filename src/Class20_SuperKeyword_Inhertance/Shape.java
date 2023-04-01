package Class20_SuperKeyword_Inhertance;


    public class Shape {
        double radius;

        Shape(double radius) {
            this.radius = radius;
        }

    }

    class Circle1 extends Shape {

        Circle1(double radius) {
            super(radius);
        }

        void circleArea() {
            System.out.println(radius * radius);
        }

        public static void main(String[] args) {

            Circle1 circle = new Circle1(5);
            circle.circleArea();

        }
    }
