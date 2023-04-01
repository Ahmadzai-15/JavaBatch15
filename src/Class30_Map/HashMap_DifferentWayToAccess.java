package Class30_Map;
import java.util.Iterator;
import java.util.Map;
public class HashMap_DifferentWayToAccess {
    public static void main(String[] args) {

        Map<String, String>map=creatMap();
        System.out.println("Method 1: Classic Iterator method");
        //iterator to assigin to loclal variable
        Iterator<Map.Entry<String, String>> iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
           Map.Entry<String, String > entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("Method2: Lambda Expession by help foreach");
        map.forEach((k,v)-> System.out.println(k+" "+v));


        System.out.println("Method3: Iterate Through keys or values ");
        for(String key:map.keySet()){
            System.out.println(key);
        }
        for(String value:map.values()){
            System.out.println(value);
        }

        System.out.println("Method4: iterator through key and get value");
        for (String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }

    }



    private static Map<String, String>creatMap(){
        return Map.of ("frank","Developer",
                "Robert","Senior Developer",
                "Julie","Tester",
                "James","Boss");
    }
}
