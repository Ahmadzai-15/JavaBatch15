package WeekendClassReview;

public class ForLoop {
    public static void main(String[] args) {
        //for loop is used when we know how maney time our block of code repeat

        for (int i = 2; i <=20 ; i++) {
            System.out.println(i);
            if(i==12) {
                break;

                //only we run once a code even its true or we can give a condition
            }
            //in for-loop we can use KeyWord of break and continue

        }
        System.out.println("*********************");

        for (int i = 1; i <=20 ; i++) {

            if (i%3==0) {
                System.out.println(i);
                continue;
            }
        }
    }
}
