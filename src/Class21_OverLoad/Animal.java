package Class21_OverLoad;

public class Animal {
    String name;
    String color="Black";


}

class Cat extends Animal{
    String color="white";

    int age=10;
    double weight;

    void printColor(){
         String color="Blue";
        System.out.println(color);      //for local variable
        System.out.println(this.color); //for instance variable
        System.out.println(super.color);    //for parent class
    }
}
