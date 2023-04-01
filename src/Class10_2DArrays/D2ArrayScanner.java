package Class10_2DArrays;

import java.util.Scanner;

public class D2ArrayScanner {
    public static void main(String[] args) {

        Scanner selab=new Scanner(System.in);
        int r=selab.nextInt();
        int c=selab.nextInt();
        int [][] a=new int[r][c];

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {

                a[i][j]=selab.nextInt();
            }

        }
        for (int i = 0; i <a.length ; i++) {
            {
            for (int j = 0; j <a[i].length ; j++) {

                System.out.print(a[i][j]+" ");
            }


        }
            System.out.println();
    }
}}
