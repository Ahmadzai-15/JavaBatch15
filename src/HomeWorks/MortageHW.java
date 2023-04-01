package HomeWorks;

public class MortageHW {
    public static void main(String[] args) {
        /*Create a Java program and store values of mortgage rate and mortgage price. First, program should
        check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying.
         Once user decides to buy a house, if price of the house is larger than 200000 than user will
         take a loan,otherwise user will pay cash.*/

        double mortgage=4.4;
        int budget=200000;

        if(mortgage>4.5){
            System.out.println("Do not buy a house");

        }else
            System.out.println("i will not buy a house");

        if(budget<200000) {
            System.out.println("take a loan");

        }else
            System.out.println("pay cash");


    }
}
