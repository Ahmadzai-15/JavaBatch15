package Class29_Set;

import java.util.TreeSet;

public class setDemo4_TreeSet {
    public static void main(String[] args) {
       //No Duplicate, following sourcing data from small to large, in alphabetic it prints A-Z
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(100);
        numbers.add(20);
        numbers.add(35);
        numbers.add(50);
        System.out.println(numbers);
        
    }
}
