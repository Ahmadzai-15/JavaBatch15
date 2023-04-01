package Class11_OOP;

public class CatTester {
    public static void main(String[] args) {

        // creating an object from the Cat class
        Cat cat1 = new Cat();
        cat1.name = "lego";
        cat1.breed = "Van Cat";
        cat1.age = 2;
        cat1.color = "Grey";
        cat1.attitude = false;
        cat1.eat();

        Cat cat2 = new Cat(); // we can assign new object as well like bellow example
        cat2.name = "loki";
        cat2.breed = "Domestic";
        cat2.color = "White";
        cat2.speak();

        System.out.println(cat2.breed);
        cat2.speak();
    }}