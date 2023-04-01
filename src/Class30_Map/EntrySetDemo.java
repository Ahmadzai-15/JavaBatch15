package Class30_Map;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {

        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Soap",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon Fruit",5.6);
        fruitMap.put("pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);

//print only those elements which contains the letter a or e in their name and their price is more than 8 dollars
        for(Map.Entry<String,Double> entry:fruitMap.entrySet()){
            String key=entry.getKey();
            double value=entry.getValue();
            //when combine two condition we must plus condition in double() then use &&
            if((key.contains("a")||key.contains("e"))&& value>8.0){
                System.out.println(key+" "+value);
            }
        }
//for single print out we can use simple below line.
//        fruitMap.forEach((key,value)-> System.out.println(key+"  "+value));
//        System.out.println(fruitMap);


    }
}
