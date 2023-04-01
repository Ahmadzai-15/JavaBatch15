package Class10_2DArrays;

public class Arrays2DHW4 {
    public static void main(String[] args) {

        /*4) Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.*/

        int[][]numbers={{2,3,45,6,} ,{8,6,3,1}};

        for (int i = 0; i <numbers.length ; i++) {

            for (int j = 0; j < numbers[i].length; j++) {


                if (numbers[i][j] % 2 == 0) {
                    System.out.println("Even Number " + numbers[i][j]);
                }
                else{
                    System.out.println("odd Number " + numbers[i][j]);
                }

            }

        }

    }
}
