package Class29_Set;

import java.util.TreeSet;

public class SetDemo3_TreeSet {
    public static void main(String[] args) {

        //Remove the Duplicate, Following the Alphabetic order
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit);
    }
}
