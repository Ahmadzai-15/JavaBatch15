package Class29_Set;

import java.util.LinkedHashSet;

public class setDemo2_LinkedHashSet {
    public static void main(String[] args) {

        //LinkedHashSet Does not allow duplication but retains the insertion order
        LinkedHashSet<String>fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Mango");
        System.out.println(fruit);
    }
}
