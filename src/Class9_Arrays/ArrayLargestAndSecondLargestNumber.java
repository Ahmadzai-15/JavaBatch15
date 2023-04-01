package Class9_Arrays;

public class ArrayLargestAndSecondLargestNumber {
    public static void main(String[] args) {
        int [] numbers = {23, 14, 5, 60, 33};

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest=numbers[i];

            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers [i];
            }
        }
        System.out.println("The largest number is "+largest+" and The Second largest number is "+secondLargest);
    }
}
