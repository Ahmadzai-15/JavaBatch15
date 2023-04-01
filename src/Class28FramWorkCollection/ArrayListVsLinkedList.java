package Class28FramWorkCollection;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {



        //Linkedlist= 155ms

        long startTime=System.currentTimeMillis();
        LinkedList<String>numbers=new LinkedList<>();
        for (int i = 0; i <100000 ; i++) {
            numbers.add(0,"test");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);

        // if i use arraylist 67280 ms
       /* long startTime=System.currentTimeMillis();
        ArrayList<String>numbers=new ArrayList<>();
        for (int i = 0; i <1000000 ; i++) {
            numbers.add(0,"test");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);*/
    }
}
