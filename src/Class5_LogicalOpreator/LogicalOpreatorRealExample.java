package Class5_LogicalOpreator;

public class LogicalOpreatorRealExample {
    public static void main(String[] args) {
        // we use logical opreator to test 2 condition

        System.out.println("--------------logical AND--------------");
        //login butten and login butten works/not example
        boolean loginButtenDisplayed=true;
        boolean loginButtenClickable=false;
        if(loginButtenDisplayed && loginButtenClickable){
            System.out.println("Test Case is passed");
        }else{
            System.out.println("Test case is failed");
        }
        System.out.println("--------------Logical OR--------------------");

        //if  user login and see dashboard example
        boolean dashboard=false;
        String message="Welcome Admin";
        if(dashboard || message.equals("Welcome admin")){
            System.out.println("User successfully login");
        }else{
            System.out.println("User Unable to login");
        }
        System.out.println("--------------LOGICAL NOT---------------");


        // click check box if not check


        boolean agreeCheckBoxsSlected=true;// false

        if(!agreeCheckBoxsSlected){
            System.out.println(" I am clicking on checkbox");
        }
        System.out.println(" I am clicking on submit butten ");

        //extra infromation
        boolean a=!false;// its true bcz we use logical not before false

    }
}
