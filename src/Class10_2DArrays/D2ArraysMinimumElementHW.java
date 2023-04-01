package Class10_2DArrays;

public class D2ArraysMinimumElementHW {
    public static void main(String[] args) {
        int[][] arr = {{12, 3, 5, 6}, {6,3,8,9}, {3, 2, 11, 56,}};

        int Min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < Min) {
                    Min = arr[i][j];
                }
            }
            System.out.print(Min + " ");
        }
    }
}
