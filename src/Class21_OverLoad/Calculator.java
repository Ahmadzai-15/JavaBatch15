package Class21_OverLoad;

public class Calculator {
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }

    void add(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }
    void add(int num1,double num2){
        System.out.println(num1+num2);
    }

    void add(double num2,int num1){
        System.out.println(num1+num2);
    }

    void add(String num2,int num1){
        System.out.println(num1+num2);
    }


}
