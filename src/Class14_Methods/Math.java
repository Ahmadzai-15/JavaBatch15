package Class14_Methods;

public class Math {

    // write the method that take 2 int numbers add them and show the result on console
    void add(int num1, int num2){
        System.out.println(num1+num2);

    }

    void mul(int number1, int number2,int number3){
        System.out.println(number1*number2*number3);
    }

    int sub(int num1,int num2){
        //it tells java whenever this method is called what is value to return
        return num1-num2;
    }
}
