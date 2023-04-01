package Class15_AccessModifires1;

public class MPractice3 {

    /*
    * create a method that takes an array of integer sum all element form array and return the element sum*/


        int arrSum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }

    public static void main(String[] args) {
        MPractice3 mp=new MPractice3();
        int[] array={23,23,23,23};
        System.out.println(mp.arrSum(array));

    }
}
