package Class21_OverLoad;

public class Area {

    /*Create 1 class in which create a methods that will calculate the area of
            Rectangle
            Square*/


    void calculateArea(double length,double width){
        System.out.println("Area of rectangle is "+(length*width));
    }

    void calculateArea(double side){
        System.out.println("Area of rectangle is "+(side*side));
    }

    public static void main(String[] args) {

        Area area=new Area();
        area.calculateArea(10);
        area.calculateArea(10,20);
    }
}
