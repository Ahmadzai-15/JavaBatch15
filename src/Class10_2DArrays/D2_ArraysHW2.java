package Class10_2DArrays;

import java.util.Scanner;

public class D2_ArraysHW2 {
    public static void main(String[] args) {
       /* 2)Using Scanner create an array of countries. When an array is created, retrieve
        all values from it and while retrieving those values print capital for each country.
        (use 2 different loops).*/

        Scanner selab=new Scanner(System.in);
        System.out.println("Enter countries name ");
        String[][]country={{"Afghanistan"+"USA"+"India"+"UK"},{"Kabul","Washington","Delhi","London"}};

        for (int i = 0; i <country.length ; i++) {
            country[0][0]=selab.nextLine();

            switch(country[0][0]){

                case "Afghanistan":
                    System.out.println("Kabul"); break;
                case "USA":
                    System.out.println("Washington-DC"); break;
                case "India":
                    System.out.println("Delhi"); break;
                case "UK" :
                    System.out.println("London"); break;


            }


        }

    }
}
