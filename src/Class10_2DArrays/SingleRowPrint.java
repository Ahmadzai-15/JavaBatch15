package Class10_2DArrays;

public class SingleRowPrint {
    public static void main(String[] args) {


        //Print single row
        int[][] arr={{23,4,5,},
                {34,34,2,4,5},
                {3,4,5,6,6}};

        int sum = 0;
        for(int i=0; i<arr[2].length;i++) {
            sum+=arr[2][i];
        }
        System.out.println(sum);
    }
}
