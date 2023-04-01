package Class28FramWorkCollection;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {

        LinkedList<String> names=new LinkedList<>();
        names.add("Artem");
        names.add("Elva");
        names.add("Tammi");
        names.add("Temuz");
        names.add("Sam");
        System.out.println("Direct print "+names);

        for(String s:names){
            System.out.println("By loop "+s);
        }
    }
}
