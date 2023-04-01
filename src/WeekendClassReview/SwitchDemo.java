package WeekendClassReview;
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        // using Scanner to ask to user to enter beowser  based on th browser  execute


        Scanner selab=new Scanner(System.in);
        System.out.println("Please enter your favarite browser");
        String browser=selab.nextLine();


        //switch(browser.toLowerCase())=change the spell if we use it.

        switch(browser.toLowerCase()){

            case "chrome":
                System.out.println("Test case execute in "+browser);
                break;
            case "safari":
                System.out.println("Test case execute in "+browser);
                break;
            case"microsoft":
                System.out.println("Test case execute in "+browser);
                break;
            default:
                System.out.println("Browser is Unknown - no execution");




        }
    }
}
