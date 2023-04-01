package Class28FramWorkCollection;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Lava");
        words.add("Computer");

//its not working with loop and enhaceloop.only it works in lambda expression check class RemoveDemo

        // remove all the elements from this list which ends with a
       /*for (String s:words
             ) {
            if(s.endsWith("a")){
                words.remove(s);
            }
        }*/

        // sometimes it's not working properly
       for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i);
            }
        }

        System.out.println(words);
}
}