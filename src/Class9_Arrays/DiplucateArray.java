package Class9_Arrays;

public class DiplucateArray {
    public static void main(String[] args) {


        int [][] array={{4,4,5,6},{12,3,4,5,6},{1,3,4,5}};
        int sum=0;
        for (int i = 0; i <array.length ; i++) {

            sum=sum+array[i].length;
            System.out.println("the dup number is "+sum);




        }



    }
}
