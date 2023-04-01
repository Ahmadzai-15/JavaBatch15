package Class29_Set;

import java.util.TreeMap;
import java.util.TreeSet;

public class HW1 {
    public static void main(String[] args) {

        //Create a Set of cities in which you want to make sure that insertion order is maintained.
        // Then remove any city that starts with “A”;

        TreeSet<String> city=new TreeSet<>();

        city.add("Virginia");
        city.add("Alexandria");
        city.add("Arlington");
        city.add("Fairfax");
        city.add("Sterling");

        System.out.println(city);
        city.removeIf(s->s.startsWith("A"));
        System.out.println(city);
    }
}
