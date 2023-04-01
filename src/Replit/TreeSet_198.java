package Replit;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_198 {
    public static void main(String[] args) {
        /*Create Set to store String Objects and you want them to be stored in ascending order
        Please add the below values and see the result *Expected Output* [America, Australia, India, South Africa]*/
            Set<String> set = new TreeSet<>();

            set.add("India");
            set.add("Australia");
            set.add("South Africa");
            set.add("India");
            set.add("America");
            set.add("America");

            System.out.println(set);
    }
}
