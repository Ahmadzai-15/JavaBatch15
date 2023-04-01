package WeekendReview10_EntrySetDemo;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo2 {
    public static void main(String[] args) {

        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Soap",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon Fruit",5.6);
        fruitMap.put("pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);

        //Remove those elements which contain the letter a or e in their price is more
        // than 8 dollars?

        //fruitMap.forEach((key,value)-> System.out.println(key+"  "+value));

        //we are using removeIf method to remove the elements-> its actually part of the syntax of lambda expression
        fruitMap.entrySet().removeIf(entry->(entry.getKey().contains("a")|| entry.getKey().contains("e"))&& entry.getValue()>8);
        System.out.println(fruitMap);

    }
}
