package Class29_Set;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

       /*
        2)Create an arraylist of cars and retrieve all the values using 3 different ways.
         */
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW Xi");
        cars.add("Tesla y");
        cars.add("Fx");
        System.out.println(cars);
        for (String car : cars) {
            System.out.println(car);
        }

        for (int i = 0; i < cars.size(); i++) {
            String car = cars.get(i);
            System.out.println(car);
        }
    }
}
