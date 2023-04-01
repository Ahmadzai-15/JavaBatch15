package WeekendReview7_Methods;

public class CarTester {
    public static void main(String[] args) {
        Tesla tesla=new Tesla("Tesla", "S",2022,340,"Electrice",true);
        tesla.start();  //comes from superClass
        tesla.drive(100);   //comes from subClass
        tesla.haveAutoPilot();
        tesla.drive(120,"NewYork ");



    }
}
