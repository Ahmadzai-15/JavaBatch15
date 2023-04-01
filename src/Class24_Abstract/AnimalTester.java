package Class24_Abstract;

public class AnimalTester {

        public static void main(String[] args) {
            // Animal animal=new Animal();
            //  animal.speak();
            Animal [] arr={new Cat(),new Dog()};
            for (Animal animal:arr){
                animal.speak();
                animal.sleep();
            }
        }
}
