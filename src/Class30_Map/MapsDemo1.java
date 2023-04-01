package Class30_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {

        HashMap<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));     // we're accessing element by Keyword
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));     //we don't have key5 so the result will be false
        System.out.println(studentsMap.containsValue("Aisha"));
        System.out.println(studentsMap.remove(1));
        System.out.println(studentsMap);
        studentsMap.replace(2,"Asli");
        System.out.println(studentsMap);





    }
}
