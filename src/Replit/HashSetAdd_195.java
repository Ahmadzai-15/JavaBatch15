package Replit;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAdd_195 {
    public static void main(String[] args) {

        /*Create the HashSet with list of Integers add the below numbers for the list
        111,111,111,999,999,999 and Print elements one by one.**Expected Output**999,111 */

        HashSet<Integer> number=new HashSet<>();

        number.add(111);
        number.add(111);
        number.add(111);
        number.add(999);
        number.add(999);
        number.add(999);




        Iterator<Integer> iterator=number.iterator();
        while(iterator.hasNext()){
            Integer numbers=iterator.next();
            System.out.println(numbers);
        }

    }
}
