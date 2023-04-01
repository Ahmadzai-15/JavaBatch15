package Class19_ThisKeyword;

public class HW {

    String fatherName;
    int ageFater;

    void print(){
        System.out.println("this is father class");
    }
}
class Child2 extends HW{

    double childFees;
    double childSaving;

    void child2(){
        System.out.println("Child Class extend by class A");
    }
}
class Child3 extends Child2{
    String name3;
    int age3;

    void child3(){
        System.out.println("Child Class extend from Class B");
    }
}
