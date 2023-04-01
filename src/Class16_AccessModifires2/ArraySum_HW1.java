package Class16_AccessModifires2;

public class ArraySum_HW1 {

    /*Create a method that will accept an array as parameters and will return a sum of all elements
        from that array. Method should be visibly only within same package and accessible by the creating
        an instance of the class.*/

    int arrayElements(int []array){

        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
        }
        return sum;


    }

    public static void main(String[] args) {

        ArraySum_HW1 hw=new ArraySum_HW1();
        int[]array={12,12,3};
        System.out.println(hw.arrayElements(array));
    }
}
