package Class29_Set;

import java.util.ArrayList;

public class LamdaExpression {
    public static void main(String[] args) {

        ArrayList<Double>numbers=new ArrayList<>();

        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.5);

        //Iterator<Double>iterator=numbers.iterator();

        System.out.println(numbers);
        numbers.removeIf(number->number>11);    //Lambda Expression
        System.out.println(numbers);

    }
}
