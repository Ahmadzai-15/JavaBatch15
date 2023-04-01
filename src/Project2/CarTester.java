package Project2;

public class CarTester {
    public static void main(String[] args) {

        Car sedan=new Sedan(20000,"Black",12);
        Car truck=new Truck(120000,"white",4000);

        System.out.println(sedan.calculateSalePrice());
        System.out.println(truck.calculateSalePrice());
    }
}
