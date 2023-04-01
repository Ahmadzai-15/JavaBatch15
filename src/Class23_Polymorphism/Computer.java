package Class23_Polymorphism;

public class Computer {
 /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the
methods in child classes Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and
 execute available methods.*/

    public void hardDisk(){
        System.out.println("Apple HardDisk 500GB");
    }
    public void RAM(){
        System.out.println("Apple 32GB RAM available");
    }
    public void screenSize(){
        System.out.println("Apple laptop available ScreenSize 17' ");
    }
}
class Lenovo extends Computer{
    @Override
    public void hardDisk() {
        System.out.println("Lenovo HardDisk 250GB");
    }

    @Override
    public void RAM() {
        System.out.println("Lenovo 32GB RAM available");
    }

    @Override
    public void screenSize() {
        System.out.println("Lenovo laptop available ScreenSize 14' ");
    }
}
class HP extends Computer{
    @Override
    public void hardDisk() {
        System.out.println("HP HardDisk 500GB");
    }

    @Override
    public void RAM() {
        System.out.println("HP 16GB RAM available");
    }

    @Override
    public void screenSize() {
        System.out.println("HP laptop available ScreenSize 18' ");
    }
}
class Dell extends Computer{

    @Override
    public void hardDisk() {
        System.out.println("Dell laptop available ScreenSize 14' ");
    }

    @Override
    public void RAM() {
        System.out.println("Dell 4GB-32GB RAM available ");
    }

    @Override
    public void screenSize() {
        System.out.println("Dell HardDisk 500GB ");
    }
}
