package Class15_AccessModifires1;

public class MPractice4 {
    //create a method that task two numbers as parameters and return the larger number
    //returnType==int
    //MethodName==returnlarger
    //Paramitir==int num1,int num2


    int largerNumber(int num1, int num2){
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static void main(String[] args) {
        MPractice4 mp=new MPractice4();
        System.out.println("Larger number is "+mp.largerNumber(12,33));
    }

}
