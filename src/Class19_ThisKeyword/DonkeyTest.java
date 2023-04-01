package Class19_ThisKeyword;

public class DonkeyTest {
    public static void main(String[] args) {

        //Donkey donkey=new Donkey(); //default constructor created by the compiler
        // when a programmer does not create one

        Donkey donkey=new Donkey("Pepper",3); // the moment YOU create a constructor
        //compiler does not give any DEFAULT construtor
        donkey.print();
        //Donkey's name is null age is 0 and weight is 0.0
    }
}