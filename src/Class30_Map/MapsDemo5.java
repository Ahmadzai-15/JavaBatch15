package Class30_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(7,"Saba");

        // remove all the keys from above map if they are greater than 2

        Set<Integer>keys=studentsMap.keySet();
        keys.removeIf(x->x>2);
        System.out.println(keys);


        //Second way
        Collection<Integer> key=studentsMap.keySet();
        key.removeIf(x->x>2);
        System.out.println(key);
        System.out.println(studentsMap);
    }
}
