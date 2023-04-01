package WeekendReview7_Methods;

public class Average_Method {
    int average(int num1, int num2) {

        return num1+num2/2;
    }

    public static void main(String[] args) {

        Average_Method average=new Average_Method();

        System.out.println("the average is "+average.average(55,88));

    }
}
