package Class29_Set;
import java.util.ArrayList;
public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Jacky","Persian",2));
        dogs.add(new Dog("Jemi","German",2));
        dogs.add(new Dog("Jacki","Bulldog",2));
        dogs.add(new Dog("Mami","USA",2));

        for(Dog d:dogs){
            d.printDogName();
        }
    }
}
