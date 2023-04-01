package WeekendReview9_Interface;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> computer=new ArrayList<>();
        computer.add("Mcbook");
        computer.add("Dell");
        computer.add("HP");
        computer.add("lenovo");

        System.out.println(computer);
        for(String s:computer){
            System.out.println(s);
        }



    }
}
