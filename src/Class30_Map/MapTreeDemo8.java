package Class30_Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeDemo8 {
    public static void main(String[] args) {
        /*Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.*/

        Map<String, String> countries = new TreeMap<>();
        countries.put("Afghanistan", "Kabul");
        countries.put("USA", "Washington DC");
        countries.put("France", "Paris");
        countries.put("Italy", "Milano");
        countries.put("Lebanon", "Beirut");

        Set<Map.Entry<String, String>> entrySet = countries.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (String country : countries.keySet()) {
            String capital = countries.get(country);
            System.out.println(country + " - " + capital);
        }
    }
}
