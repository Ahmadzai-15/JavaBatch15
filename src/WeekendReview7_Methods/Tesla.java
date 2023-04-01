package WeekendReview7_Methods;

public class Tesla extends Car{
        //Tesla is subclass of CarClass
    //Car class is super class of Tesla

    String type;
    boolean autoPilot;
    Tesla(String make, String model,int year, int horsePower,String type,boolean autoPilot){
        super(make, model, year, horsePower);
        this.type=type;
        this.autoPilot=autoPilot;
    }

    protected void haveAutoPilot(){
        System.out.println(make+" have auto pilot "+autoPilot);
    }

    public void start(){       // OverRiding is when we have same method name in 2 differint class (parent-child
        // in OverRiding -Inhertance is a must.in OverRiding method signature should be same.

    }
}
