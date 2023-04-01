package Class19_ThisKeyword;

public class Donkey {
    String name;
    int age;
    double weight;

    Donkey(String name, int age){
        this.name=name;
        this.age=age;
    }

    /*
    Donkey(){
     System.out.println("This is non argument constructor");
    }
     */

    void print(){

        System.out.println("Donkey's name is "+name+" age is "+age+" and weight is "+weight);
    }
    }


