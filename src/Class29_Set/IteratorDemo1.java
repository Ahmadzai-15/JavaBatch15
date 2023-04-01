package Class29_Set;
import java.util.Iterator;
import java.util.ArrayList;

public class IteratorDemo1 {
    public static void main(String[] args) {

        //Remove all entry that are greator than 11.
        ArrayList<Double>numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);

        /*numbers.removeIf(number->number>11);    //Lamda Expression genrally we use this method to perfome
        System.out.println(numbers);            // opreations.

        numbers.remove(40.5);                   //remove elements by object
        System.out.println(numbers);

        numbers.remove(3);                   //remove elements by index
        System.out.println(numbers);*/

        //Performe different activities we use iterator and iterator works fine with collections
      Iterator<Double> iterator= numbers.iterator();
      // hasNext() keeps on returning true as long as there are elements left to be iterated
        while(iterator.hasNext()){
            double number=iterator.next();
            if(number>11){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
