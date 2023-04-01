package Replit;

import java.util.HashSet;

public class HashSet_196 {
    public static void main(String[] args) {

       // Create a Set and below values to it.[third, first, second]
        //Print HashSet and then remove all the elements from Hashset and print it again.*Expected Output:**
        //[third, first, second] and [].

        HashSet<String> name=new HashSet<>();
        name.add("third");
        name.add("first");
        name.add("second");

        System.out.println(name);
        name.clear();
        System.out.println(name);

    }
}
