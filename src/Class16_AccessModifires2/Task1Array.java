package Class16_AccessModifires2;

public class Task1Array {
    /*1) Create a method that will accept an array as parameters and will return a sum of all elements
    from that array. Method should be visibly only within same package and accessible by the creating
    an instance of the class.*/

    //return type is Int
    //name sumElement
    //int[] arr
    //access modifire default

     int sumArrayElemnets(int []array){
         int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {

        int[] arr={12,3,4,5};
        Task1Array task=new Task1Array();

        System.out.println(task.sumArrayElemnets(arr));

    }
}
