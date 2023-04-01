package WeekendReview7_Methods;

public class Car {

    String make, model;
    int year,horsePower;

    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }
     Car(String make, String model,int year, int horsePower){
        this(make, model);
        this.year=year;
        this.horsePower=horsePower;
    }
    public void start(){
        System.out.println(make+" Start");
    }
    public void drive(int speed){
        System.out.println(make+" drives with speed "+speed);
    }
    //same class have 2 or more methods with same name=method overloading.
    //how to implement? 1- by using diffirent number of paramiter or using diffirent type of paramitier or seqiunce of type.
    void drive(String destination ){
        System.out.println(make+" drives to "+destination);
    }
    void drive(int speed, String destination){
        System.out.println(make+" drives to "+destination+"with speed "+speed);
    }
    void drive(String destination, int speed){
        System.out.println(make+"drive to "+destination+" drives with speed "+speed);
    }

}
