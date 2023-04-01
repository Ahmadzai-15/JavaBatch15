package WeekendClassReview;

public class NestedLoop {
    public static void main(String[] args) {
        //nested loop- loop inside another loop
        for (int i = 1; i <=3 ; i++) { //Outer Loop
            System.out.print(i+" hi ");
            for (int j = 1; j <=4 ; j++) { //innerLoop
                System.out.print(j+"hello ");

            }

        }
    }
}
