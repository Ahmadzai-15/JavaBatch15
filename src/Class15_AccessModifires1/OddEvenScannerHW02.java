package Class15_AccessModifires1;

import java.util.Scanner;

public class OddEvenScannerHW02 {
    // create a method which returns true or false and take the int numbers as a parameter if number is
    // even it returns true otherwise it returns false

                                    //one why
    boolean isEven(int number){
        boolean flag;
        if(number%2==0){
            flag=true;
        }else {
            flag=false;
        }
        return flag;
    }
                                        //Second Why
    boolean isEven1(int number){

        if(number%2==0){
            return true;
        }else {
            return false;
        }
    }
                                            //3rd why
    boolean isEven2(int number){

        return number%2==0;
    }


    public static void main(String[] args) {
        OddEvenScannerHW02 oddEven=new OddEvenScannerHW02();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number ");
         int number=scanner.nextInt();
        System.out.println(number+" is "+oddEven.isEven2(number)+" Number");
    }
}
