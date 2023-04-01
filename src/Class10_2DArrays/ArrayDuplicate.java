package Class10_2DArrays;

public class ArrayDuplicate {
    public static void main(String[] args) {

        int []array={2,3,45,6,7,7,76,3,2,33,4,};
        for (int i = 0; i <array.length -1; i++) {
            for (int j = i+1; j <array.length ; j++){
                if(array[i]==array[j]){
                    System.out.println("The Duplicate Number is "+array[j]);
            }
        }
        }
    }
}
