package SelfTestExcersice;

import Class29_Set.LamdaExpression;

import java.util.ArrayList;

public class ArrayList009Test {
    public static void main(String[] args) {


        ArrayList<Double> numbers=new ArrayList<>();

        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.5);

        numbers.removeIf(number -> number > 11);    //LambdaExpression
        System.out.println(numbers);

    }
}
