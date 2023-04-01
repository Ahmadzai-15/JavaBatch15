package Class10_2DArrays;

public class ForEachLoopDemo2Notes {
    public static void main(String[] args) {

        int[] arr={12,13,20,25,45,50};



        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2!=0){

                //arr[2]=0 for single changing we use this method
                arr[i]=0; // for odd printing and changing value we use this method
                System.out.println(arr[i]);
            }

        }
    }
}
