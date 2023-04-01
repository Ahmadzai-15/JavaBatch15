package Class9_Arrays;

public class ArrayDemo6 {
    public static void main(String[] args) {
        // Create an empty array then store 45 44 33 20 and 10 in it then use a loop
        // to add all the elements which are present on even indexes and print it after adding them

        // create an array and store 10,20,30,4,5,6,7,80
        // add all the element which are multiple of 2
        // back by 1:50;
        int [] numbers= new int[5];
        numbers[0]=45; //45+0
        numbers[1]=44;
        numbers[2]=33; // 45+33=>78
        numbers[3]=20;
        numbers[4]=10; // 78+10=> 88
        // numbers[5]=50; error out of bounds

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            if(i%2==0){
                sum=sum+numbers[i];
            }

        }
        System.out.println(sum);
    }
}
