package WeekendReview7_Methods;

public class MinimumArray_Method {


    //creat a method that will return a minimum number in given array.
    static int minVal(int[] a){
        int min=a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]<i){
                min=a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        MinimumArray_Method min=new MinimumArray_Method();
        int[]array={2,3,4,5,7};
        int minimum = min.minVal(array);

        System.out.println("the minimum number is "+minimum);
        System.out.println(min.minVal(array));

    }
}
