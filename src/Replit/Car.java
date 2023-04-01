package Replit;

public class Car {

    String make;
    String model;
    int numberOfDoors;
    double topSpeed;
    double price;

    Car( String make,String model,int numberOfDoors,double topSpeed,double price){

        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Car(String make,String model,double topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Car(int numberOfDoors, int topSpeed, double price){
        this.make=make="unknown";
        this.model=model="unknown";
        this.numberOfDoors=numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Car(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model=model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = 90;
        this.price = 0.0;
    }
    public void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }}

