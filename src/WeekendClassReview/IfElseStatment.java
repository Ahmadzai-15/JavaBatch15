package JavaReview2;

public class IfElseStatment {
    public static void main(String[] args) {
        /*if statement
        if(boolean condtition)
        code a
        /
         */
        int num=12;
        if(num>100){
            System.out.println("num"+ "is greater than a 100");//dose not print bcz my condition was false
        }else{
            System.out.println(num+" is less than a 100");
        }
        String button="Enroll today";
        if(button.equals("Enroll today")){
            System.out.println("Test case pass");
        }else{
            System.out.println("test case failed");
        }

    }
}
