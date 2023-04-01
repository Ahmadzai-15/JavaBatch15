package Class30_Map;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {

        HashMap<String, Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("mascara",70.0);
        makeup.put("eyeliner",12.2);
        makeup.put("Blush-on",12.2);

        //we can access all keys and values in this way line 17,18
        System.out.println(makeup.keySet());
        System.out.println(makeup.values());
        System.out.println(makeup);
        System.out.println("*********************************");

        // TO get all the keys we can use keySet Method from Map interface
        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);


        // Delete all the entries from the map for which the size of key is greater than 7
        allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);
        System.out.println(makeup);





    }
}
