package Replit;
import java.util.*;
public class HashSet_203 {
    public static void main(String[] args) {


        /*Create HashMap add values as belowmap.put("mango", 10); map.put("apple", 30); map.put("orange", 20);
        map.put("mango", 40); map.put("mango", 40); and Using iterator retrieve all keys and values if the format below:
        **Expected Output:**Key = orange and value = 20 Key = apple and value = 30 Key = mango and value = 40*/
        HashMap<String, Integer>map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());

        }

    }
}
