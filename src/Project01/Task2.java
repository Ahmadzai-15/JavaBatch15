package Project01;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //)Using Scanner create an array of countries.
        // When an array is created, retrieve all values from it
        // and while retrieving those values print capital for each country. (use 2 different loops).
        Scanner scan=new Scanner(System.in);
        String arr[] = new String[6];
        System.out.println("Please enter 5 countries");
        for(int i=0;i< arr.length;i++){
            arr[i]=scan.next();
        }
        for(int i=0;i< arr.length;i++){
            switch (arr[i]){
                case "India":
                    System.out.println(arr[i]+"::Delhi");
                    break;
                case "USA":
                    System.out.println(arr[i]+"::Washington");
                    break;
                case "Canada":
                    System.out.println(arr[i]+"::Ottava");
                    break;
                case "Uk":
                    System.out.println(arr[i]+"::London");
                    break;
                case "Mexico":
                    System.out.println(arr[i]+"::Mexico city");
                    break;

            }
            // System.out.println(arr[i]);
        }

    }
}
