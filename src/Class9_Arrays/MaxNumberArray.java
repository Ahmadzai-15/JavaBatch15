package Class9_Arrays;

public class MaxNumberArray {
    public static void main(String[] args) {
        int large=0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+" ");

            if(nums[i]>large){
                large=nums[i];
            }
        }
        System.out.println(">=====> Max number is: "+large);
    }
}
