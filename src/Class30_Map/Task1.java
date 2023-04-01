package Class30_Map;

import java.util.LinkedHashSet;

public class Task1 {

    /*
 Create a Set of cities in which you want to make sure that insertion order is maintained.
     Then remove any city that starts with “A”;
  */
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Richmond");
        cities.add("FairFax");
        cities.add("Mclean");
        cities.add("Annandale");

        cities.removeIf(x->x.startsWith("A")||x.startsWith("a"));
        System.out.println(cities);
    }
}
