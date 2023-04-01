package Class28FramWorkCollection;
import java.util.ArrayList;
public class ArrayListHW2 {
    public static void main(String[] args) {
       // 2)Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList<String>car=new ArrayList<>();
        car.add("RAM");
        car.add("FORD");
        car.add("BMW");
        car.add("Tesla");
        System.out.println(car);
        for(String s:car){
            System.out.println(s);
        }
        for(int i=0;i<car.size();i++){
           String cars= car.get(i);
            System.out.println(cars);
        }
    }
}
