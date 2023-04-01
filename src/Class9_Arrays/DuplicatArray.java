
package Class9_Arrays;

public class DuplicatArray {
    public static void main(String[] args) {


    int []number={2,3,4,5,6,7,8,8,2};
        for (int i = 0; i <number.length ; i++) {
            for (int j = i+1; j <number.length ; j++) {
            if(number[i]==number[j]){
                System.out.println("dulplicate "+number[i]);
            }
            }
        }
}
}

