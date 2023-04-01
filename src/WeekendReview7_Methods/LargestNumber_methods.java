package WeekendReview7_Methods;

public class LargestNumber_methods {

    int findLargest(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        LargestNumber_methods class03=new LargestNumber_methods();

        System.out.println("Largest number is "+class03.findLargest(100,200));
    }
}