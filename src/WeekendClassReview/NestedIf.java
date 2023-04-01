package JavaReview2;

public class NestedIf {
    public static void main(String[] args) {
        /*
        nested if is 1 is statment inside another if statement/
        when we have 1 condition that depend on another we go for nested if condtion
         */
        boolean vaccine= true;
        int dose=2;
        if(vaccine){// outer if
            System.out.println("how many doses you have");

            // inner if
            if(dose==1){
                System.out.println("you need second shot");
            }else{
                System.out.println("you are fully vaccinated");
            }
        }else{
            System.out.println("i do not have a vaccine");
        }
    }
}
