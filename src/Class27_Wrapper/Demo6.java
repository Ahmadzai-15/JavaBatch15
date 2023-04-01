package Class27_Wrapper;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<Boolean>booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        //System.out.println(booleans.get(4));
        //System.out.println(booleans.get(0));
        for(int i=0;i<booleans.size();i++){     //by help for loop
            System.out.println(booleans.get(i));
        }
        //by help While loops
        int i=0;        //Same like for loop we put it initilize in while loops
        while (i<booleans.size()){      //condition will be here
            System.out.println(booleans.get(i));        //same out put will be like for loop
            i++;
        }
    }
}
