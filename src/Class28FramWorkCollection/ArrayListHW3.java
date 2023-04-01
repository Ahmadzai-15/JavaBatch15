package Class28FramWorkCollection;
import java.util.ArrayList;
public class ArrayListHW3 {
    public static void main(String[] args) {

        //Create an arrayList of words. Remove every word that ends with “m”
        ArrayList<String>word=new ArrayList<>();
        word.add("Tom");
        word.add("Tony");
        word.add("Wiky");

        word.removeIf(s->s.endsWith("m"));
        System.out.println(word);

    }
}
