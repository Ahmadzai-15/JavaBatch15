package Class14_Methods;

public class Method1Demo {
    public static void main(String[] args) {

        int[] array1={12,3,4,5,4};

        int sum=0;
        for(int number:array1){
            sum+=number;
        }
        System.out.println(sum);

        int[] array={12,5,4,5,4};
        int sum2=0;
        for (int numbers:array){
            sum2+=numbers;
        }
        System.out.println(sum2);

    }
}
