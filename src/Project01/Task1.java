package Project01;

public class Task1 {

        public static void main(String[] args) {

            //Write a java program to find the second largest number in the array?
            int arr[] = {110, 77, 22, 88, 33, 99, 44, 66, 55};
            int sort[]=new int[arr.length];
            int max=0;

            for (int i = 0; i < arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        max=arr[i];
                        arr[i]=arr[j];
                        arr[j]=max;
                    }
                }
            }
            System.out.println(arr[arr.length-2]);
    }
}
