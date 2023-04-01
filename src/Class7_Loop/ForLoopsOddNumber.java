package Class7_Loop;

public class ForLoopsOddNumber {
    public static void main(String[] args) {

        /*
        * HOW to find odd number in For Loop in two way  */

        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            System.out.println("********************");
        }
            for (int j = 0; j <20 ; j++) {
                if(j%2!=0){
                    System.out.println(j);
                }

            }

    }
}
