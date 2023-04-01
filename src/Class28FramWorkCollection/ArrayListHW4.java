package Class28FramWorkCollection;

import java.util.ArrayList;

public class ArrayListHW4 {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Vodka");
        drinks.add("Juice");
        drinks.add("Beer");
        drinks.add("Milk");

        for (int i = 0; i <drinks.size() ; i++) {
            String drink=drinks.get(i);
            if(drink.contains("a")|| drink.contains("a")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);

    }
}
