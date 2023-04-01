package Class9_Arrays;

public class MinNumber {
    int minNumber(int[]array){
        int min=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<i){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        int[]number={25,34,42,53,66,67};
        MinNumber min=new MinNumber();
        System.out.println("The Min number is "+min.minNumber(number));
    }
}
