package Class29_Set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
public class MapDemo {
    public static void main(String[] args) {

        //HashMap<String, Integer>info=new HashMap<>();
        LinkedHashMap<String, Integer>info=new LinkedHashMap<>();
        //TreeMap<String, Integer>info=new TreeMap<>();

        info.put("Eggs",10);
        info.put("Milk",5);
        info.put("Bread",20);
        info.put("Rice",7);
        info.put("Meat",9);
        info.put("Karlay",4);
        info.put("soup",6);

        System.out.println(info.get("Meat"));
        System.out.println(info);
        System.out.println(info.isEmpty());
        System.out.println(info.size());
        info.remove("Meat");    //this is how we remove element form Hashmap
        System.out.println(info);



    }
}
