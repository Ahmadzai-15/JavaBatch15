package Class4;

public class NestedIfDemo3 {
    public static void main(String[] args) {
        boolean studyHard=true;
        int salary=90000;
        if(studyHard){
            System.out.println("we get the jobs");

            if(salary>100000){
                System.out.println("buy tesla");
            }
            else{
                System.out.println("Buy Toyota");
            }



        }else{
            System.out.println("it take little longer for us to get the jobs");// java execute bcz its true if
            //the condition of false then print will be this "it take little longer for us to get the jobs".
        }



    }
}
