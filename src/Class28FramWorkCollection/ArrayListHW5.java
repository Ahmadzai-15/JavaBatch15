package Class28FramWorkCollection;

import java.util.ArrayList;

public class ArrayListHW5 {
    public static void main(String[] args) {
        /*5)Create an arrayList of even numbers from 1 to 500. Remove any number
          that is divisible by 5 from that arrayList.*/

        ArrayList<Integer>number=new ArrayList<>();

        for (int i = 2; i <=500 ; i+=2) {
            number.add(i);
        }
       number.removeIf(s->s%5==0);
        System.out.println(number);
    }
}
