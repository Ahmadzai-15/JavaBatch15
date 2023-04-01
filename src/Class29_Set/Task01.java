package Class29_Set;

import java.util.Set;
import java.util.TreeSet;

public class Task01 {
    public static void main(String[] args) {
        /*Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.*/

        TreeSet<String> name=new TreeSet<>();
        name.add("Afghanistan");
        name.add("USA");
        name.add("India");
        name.add("Canada");

        System.out.println(name);

        for(String s:name){
            System.out.print(s+",");
        }
    }
}
