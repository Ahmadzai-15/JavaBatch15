package Replit;
import java.util.*;
public class HashSet_197 {
    public static void main(String[] args) {
        /*Create a set collection in which you do not want to preserve or sort the order and add below values to it.
        Red, Pink, White, Yellow, Black, ***Expected Output:** [Red, Pink, White, Yellow, Black] and Size of the Hash Set: 5*/
        HashSet<String> name=new HashSet<>();
        name.add("Red");
        name.add("Pink");
        name.add("Yellow");
        name.add("White");
        name.add("Black");
        System.out.println("Original Hash Set: "+name);
        System.out.println("Size of the Hash Set: "+name.size());
    }
}
