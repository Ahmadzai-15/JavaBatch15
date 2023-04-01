package Class29_Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class setsDemo5_Remove_Duplicate {
    public static void main(String[] args) {

        ArrayList<Integer>number=new ArrayList<>();
        number.add(10);
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(30);
        System.out.println(number);
        //Write the logic to remove the duplicates from the above list.

        //bcz the linkedHasSet doesn't allow duplicate, just by adding constructor the duplicate will remove
        LinkedHashSet<Integer> uniqeNumber=new LinkedHashSet<>(number);
        System.out.println(uniqeNumber);




    }
}
