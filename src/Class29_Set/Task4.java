package Class29_Set;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {


        //4-Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Vodka");
        drinks.add("Juice");
        drinks.add("Beer");  // 2 , water
        drinks.add("Milk");

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(i,"water"); // replacing. The 'I' is index of loop
            }
        }
        System.out.println(drinks);
    }
}
