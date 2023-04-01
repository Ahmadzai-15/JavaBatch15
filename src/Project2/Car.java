package Project2;

public class Car {
    /*
    * Create a class Car that would have the following field: carPrice and color and method calculateSalePrice()
    * which should be returning a price. Create 2 subclass: Sedan and Truck. the Truck  class has a field as weight
    * and has its implementation of calculateSalePrice() method in which returned price is calculated as following
    *  if weight>2000 the returned price car should include 10% discount, otherwise 20% discount.
    * the Sedan calls has field as length and also does its own implementation of calculateSalePrice (): if
    * length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
    * */

    double carPrice;
    String color;
    public Car(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    public double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car{
    private double length;

    public Sedan(double carPrice, String color,double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    public double calculateSalePrice() {
        if(length>20){
            return carPrice*5;
        }else{
            return carPrice*10;
        }
    }
}
class Truck extends Car{

    double weight;
    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }
    public double calculateSalePrice(){
        if(weight>2000){
            return carPrice*10;
        }else{
            return carPrice*20;
        }
    }
}