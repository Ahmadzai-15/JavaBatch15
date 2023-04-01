package Class9_Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 10 20 30 45 50
        int [] numbers={10,20,30,45,50};

        // Write code to add all the numbers from an array
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i]; // adding all the numbers
        }
        System.out.println(sum);
    }
}
