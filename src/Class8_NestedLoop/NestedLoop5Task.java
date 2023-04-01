package Class8_NestedLoop;

public class NestedLoop5Task {
    public static void main(String[] args) {

        /*1234
          1234
          1234*/

        for (int i = 1; i <=3; i++) { //execute the bellow code 3 time.


            for (int j = 1; j <=5; j++) {
                System.out.print(j+" ");// print the value of j from 1-5 time.
            }
            System.out.println();
        }

    }
}
