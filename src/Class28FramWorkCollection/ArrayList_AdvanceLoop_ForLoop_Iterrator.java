package Class28FramWorkCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_AdvanceLoop_ForLoop_Iterrator {
    public static void main(String[] args) {

        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(14);
        arrayList.add(7);
        arrayList.add(39);
        arrayList.add(40);
        //Looping Arraylist using Iterator
        Iterator iterator= arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Advance Loop
        for (Integer num:arrayList){
            System.out.println(num);
        }
        //For Loop for iterating ArrayList
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
