package Class30_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(7,"Saba");

        Collection<String> values=studentsMap.values();
        System.out.println(values);
        // remove all values which contain the letter i
        values.removeIf(x->x.contains("i"));
        System.out.println(studentsMap);
        // remove the entries if key is greater than 2 and value contains the letter i



    }
}
