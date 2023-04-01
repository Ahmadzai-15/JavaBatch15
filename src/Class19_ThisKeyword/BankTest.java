package Class19_ThisKeyword;

public class BankTest {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=765765875875l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        //ba.tranfer(); methods defined inside child class not available to the parent class

        System.out.println("  -- Creating an Object of Checking account");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=5765;
        check.money=780;
        //features from checking class itself
        check.interest=0;

        check.deposit(); //from parent
        check.transfer(); //from child

        System.out.println("  -- Creating an Object of Savings account");

        Savings save=new Savings();
        save.accountNumber=8758585985l;
        save.money=7657;
        save.profit=100;
        //save.interest=0; siblings features are not available

        save.deposit();//from parent
        save.takeProfit();//comes from savings
        //save.transfer(); not available



    }
}
