package HomeWorks;

public class ArrayHW4 {
    public static void main(String[] args) {
        /*4) Create an array that can store names of cars and store
        6 elements into it.Print all values from the array.*/

        String[] cars=new String[6];

        cars[0]="Toyota";
        cars[1]="Tesla";
        cars[2]="RAM";
        cars[3]="FORD";
        cars[4]="Chev";
        cars[5]="Nissan";
        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i]);

        }

    }
}
