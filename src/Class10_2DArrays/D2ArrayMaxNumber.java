package Class10_2DArrays;

public class D2ArrayMaxNumber {
    public static void main(String[] args) {

        int[][] arr = {{12, 3, 5, 6}, {12, 33, 44, 5, 6,}, {3, 2, 11, 56,}};

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
