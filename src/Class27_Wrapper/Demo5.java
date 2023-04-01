package Class27_Wrapper;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('Z');
        characters.add('D');
        characters.add('F');
        characters.add('H');
        characters.add('G');

        for(Character c:characters){
            System.out.print(c+" , ");
        }
    }
}
