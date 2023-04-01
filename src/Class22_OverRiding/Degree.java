package Class22_OverRiding;

public class Degree {
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you
     need high school diploma"". Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
     In Masters class override method 'getPrerequisite'.Call the method by creating an object of each
     of the three classes.*/
    void print(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{


}
class Master extends Degree{

    void print(){
        System.out.println("To get a Master degree you need Bachelor degree");
    }
}
