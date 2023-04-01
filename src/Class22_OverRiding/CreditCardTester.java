package Class22_OverRiding;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard cr=new CreditCard();
        cr.printCredit(190000,8.5);

        Visa vAx=new Visa();
        vAx.printCredit(170000,7.5);

        VisaAx visaAx=new VisaAx();
        visaAx.printCredit(150000,4.5);
    }
}
