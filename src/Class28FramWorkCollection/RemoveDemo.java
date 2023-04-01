package Class28FramWorkCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");


        // it Var keyword it use it java 10 no need to specify data type, java will understand what data you use.
        var name="kdbsfnjksdf";
        var c='s';
        var f=12.5;


        /*
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(words);   */


        // does not work in java 7 but works java 8.1 or latest version and called it Lambda expression.
        words.removeIf(x -> x.endsWith("a"));

        System.out.println(words);
    }
}
