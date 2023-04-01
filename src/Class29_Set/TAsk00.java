package Class29_Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class TAsk00 {
    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        LinkedHashSet<String>duplicate=new LinkedHashSet<>(aList);
        System.out.println(duplicate);

    }
}
