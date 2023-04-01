package Class19_ThisKeyword;

public class HWTest {
    public static void main(String[] args) {


        HW hw=new HW();
        hw.ageFater=55;
        hw.fatherName="John";
        System.out.println(hw.ageFater);
        System.out.println(hw.fatherName);

        System.out.println("_____________");

        Child2 child2=new Child2();
        child2.childFees=23;
        child2.childSaving=233.44;
        System.out.println(child2.childSaving);
        System.out.println(child2.childFees);

        System.out.println("-----------");

        Child3 child3=new Child3();
        child3.name3="Jeni";
        child3.age3=23;

        System.out.println(child3.name3);
        System.out.println(child3.age3);

        System.out.println("END OF OBJECTS");




    }
}
