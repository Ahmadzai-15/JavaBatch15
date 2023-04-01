package Class28FramWorkCollection;
import java.util.ArrayList;
public class ArrayLIstHW1 {
    public static void main(String[] args) {
                /*1) Create an ArrayList that will store 5 names into it.
                Find out whether the given ArrayList is empty or not?
                Check whether the specific name is present in an ArrayList or not?
                Find the size of your arrayList and print all values from that*/
        ArrayList<String>names=new ArrayList<>();
        names.add("Jemi");
        names.add("Keti");
        names.add("Cat");
        names.add("Dog");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Keti"));
        System.out.println(names.size());
        System.out.println(names);




    }
}
