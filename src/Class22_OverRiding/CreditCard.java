package Class22_OverRiding;

public class CreditCard {

    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

  /*  public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }*/
    //Java create default constructor in this class bcz we didnt creat any constructor.

    public void printCredit(double balance, double interest){
        System.out.println("The interest rate for CreditCard is "+(balance*interest/100));
    }
}
class Visa extends CreditCard{

}
class VisaAx extends CreditCard{
    public void printCredit(double balance, double interest){
        System.out.println("The interest rate for VisaAx is "+(balance*interest/100));
    }



}
