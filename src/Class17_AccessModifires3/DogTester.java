package Class17_AccessModifires3;

public class DogTester {
    public static void main(String[] args) {
        Dog husky = new Dog("Husky", "Husky the dog", 2, 25.2);
        husky.printInfo();
        Dog bulldog = new Dog("Bulldog", "Bulldog the dog", 3, 27.1);
        bulldog.printInfo();
        Dog labrador = new Dog("Labrador", "Labrador the dog", 4, 28.0);

        labrador.printInfo();
    }
}