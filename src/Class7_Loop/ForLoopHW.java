package Class7_Loop;

public class ForLoopHW {
    public static void main(String[] args) {

        for (int i = 1; i <100 ; i++) {
            System.out.print(i+" ");
        }
        //Print numbers from 100 to 1
        for (int j = 100; j >0 ; j--) {
            System.out.println(j);
        }
        //Print even numbers from 20 to 1
        for (int a = 1; a > 20; a--) {
             System.out.println(a);
         }
        //Print odd numbers between 20 and 50

        for (int b = 20; b <50 ; b++) {
            if(b%2==0){
                System.out.println(b);
            }
        }
        //Print numbers from 1 to 100 in 1 line with space
        for (int c = 1; c <100; c++) {
            System.out.print(c+" ");

        }



    }
}
