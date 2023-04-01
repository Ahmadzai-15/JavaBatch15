package Class30_Map;

import java.util.ArrayList;

public class Task4 {
    /*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
    as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
    Car class has its own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the subclasses and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.*/
    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("Geico","BMW"));
        insurances.add(new Pet("Pet love","Cat"));
        insurances.add(new Health("Allianz"));

        for (Insurance i:insurances){
            i.getQuote();
            i.cancelInsurance();
        }
    }
}
abstract class  Insurance{
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}

class Car extends Insurance{
    String carModel;
    Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }
    @Override
    public void getQuote() {
        System.out.println(insuranceName+" quote is 2000$ a year");
    }
    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your car insurance any time you want without any penalty");
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }
    @Override
    public   void getQuote() {
        System.out.println(petType+"'s insurance 580$ a year");
    }
    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your "+insuranceName+" anytime");
    }
}
class Health extends Insurance {

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Your health insurance is 3400$ per year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your " + insuranceName + " anytime with %7 fee");

    }
}
