package Class8_NestedLoop;

public class ContinueKeyWorldDemo1 {
    public static void main(String[] args) { // BReak and continue alwys come after if condition
        for (int i = 0; i <10 ; i++) {
            if(i%3==0){ // we can write it as--- if( i==3 ||i==6 ||i==9 ) are same
                continue; // mean skip
            }else{
                System.out.println(i);

            }

        }
    }
}
