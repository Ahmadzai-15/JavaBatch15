package Replit;
import java.util.LinkedList;
public class LinkedList_Sum_193 {
    public static void main(String[] args) {
        /*Create Linked List that will store Integer Objects Add the values below:
        111,222,333,444,555,666 and Create a logic to calculate sum of the all the values in list.
        Print the result of sum. **Expected Output:** Result of sum is 2331*/
        LinkedList<Integer> values=new LinkedList<>();
        values.add(111);
        values.add(222);
        values.add(333);
        values.add(444);
        values.add(555);
        values.add(666);
        int sum=0;
        for (Integer integer : values) {
            sum+=integer;
        }
        System.out.println(sum);
    }
}



