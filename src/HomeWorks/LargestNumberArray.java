package HomeWorks;

public class LargestNumberArray {
    public static void main(String[] args) {


        int num1[] = new int[]
                {10,18,20,7,12,9,8,7,14,1};

        int SmallestNum=num1[0];
        int LargestNum=num1[0];

        for (int j = 1; j < num1.length; j++) {
            if(num1[j]>LargestNum){
                LargestNum=num1[j];
            }else if(num1[j]<SmallestNum){
                SmallestNum=num1[j];
            }
        }
        System.out.println("The smallest number is "+SmallestNum);
        System.out.println("The largest number is "+LargestNum);
    }
}
