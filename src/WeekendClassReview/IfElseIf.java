
package JavaReview2;

public class IfElseIf {
    public static void main(String[] args) {
        /*IfElseIf when we have multiples condition to test.
         *
         * IF(boolean condition){
         *   Code A
         * }else if(boolean condition){
         *       Code B
         * else if(boolean condition){
         *       Code C
         *
         * example: if you completed more 25> great jon
         * if you competed more than >20 good job
         * if you completed more than>10- ok job
         * if you completed more than >5-not good job
         * */

        int assignment = 30;
        if (assignment > 25) {
            System.out.println("Great Job");
        } else if (assignment > 20) {
            System.out.println("Good Job");
        } else if (assignment > 10) {
            System.out.println("Ok Job");
        } else if (assignment > 10) {
            System.out.println("not good Job");
        }

    }}


