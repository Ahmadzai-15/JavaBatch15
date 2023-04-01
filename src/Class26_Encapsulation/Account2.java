package Class26_Encapsulation;

public class Account2 {
        private double balance;
        private String accountNumber;
        private String type;
        private String accountTitle;

        public void setAccountNumber(String accountNumber){
            if(accountNumber.length()!=16){
                System.out.println("Wrong account number");
            }else {
                this.accountNumber=accountNumber;
            }
        }

        public String getAccountNumber(){
            return accountNumber;
        }
        public void setBalance(double balance){
            // sanitizing the input meaning checking the values before we can assign them.
            if(balance<0){
                System.out.println("Negative balance is not allowed its a current account");
            }else {
                this.balance=this.balance+balance;
            }
        }

        public double getBalance(){
            return  balance;
        }
        public String getAccountTitle(){
            return  accountTitle;
        }

        public Account2(double balance, String accountNumber, String type, String accountTitle) {
            this.balance = balance;
            this.accountNumber = accountNumber;
            this.type = type;
            this.accountTitle = accountTitle;
        }


    }

    class AccountTester{
        public static void main(String[] args) {

            Account2 account=new Account2(-1000,"kjnfjkddsn","dsnfksf","kdnfksnf");

            System.out.println(account.getAccountTitle());
            account.setBalance(-4546456);



        }
}
