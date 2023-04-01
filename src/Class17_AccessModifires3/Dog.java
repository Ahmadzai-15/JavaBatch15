package Class17_AccessModifires3;

public class Dog {
    String name;
    String breed;
    int age;
    double weight;

    Dog(String dogName, String dogBreed, int
            dogAge, double dogWeight) {
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        weight = dogWeight;
    }

    void printInfo() {
        System.out.println("Name " + name + " Breed " + breed
                + " age " + age + " Weight " + weight);
    }
}