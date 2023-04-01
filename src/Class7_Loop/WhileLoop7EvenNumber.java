package Class7_Loop;

public class WhileLoop7EvenNumber {
    public static void main(String[] args) {

        int number=2;
        while(number<10){

            if(number%2==0){
                System.out.println("Even "+number);
            }
            number++;
        }
    }
}
