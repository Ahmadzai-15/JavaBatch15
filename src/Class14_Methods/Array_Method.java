package Class14_Methods;

public class Array_Method {


    void printArray(int[]a){
        int sum=0;
        for (int i = 0; i <a.length; i++) {
            sum+=a[i];
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] args) {
        Array_Method array=new Array_Method();
        int arr[]={2,3,4,5,6};
        array.printArray(arr);

    }
}
