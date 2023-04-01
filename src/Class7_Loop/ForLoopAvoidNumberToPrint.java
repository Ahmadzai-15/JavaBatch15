package Class7_Loop;

public class ForLoopAvoidNumberToPrint {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            if(i%3!=0){ //This condition divides all the number bu 3 and chcks if the remainder is not zero.
                System.out.println(i);
            }

            }

        for (int a = 1; a <20 ; a++) {
            if(a==5){
                break;

            }
            System.out.println(a);

        }
    }
}
