package Class20_SuperKeyword_Inhertance;

public class HW1_Circle {

    double radius;
    public HW1_Circle(double radius){

        this.radius=radius;
    }
}
class Circle extends HW1_Circle{
    public Circle(double radius){
        super(radius);

    }
    public double calculationOfArea(){
        return Math.PI*radius*radius;
    }

   }




