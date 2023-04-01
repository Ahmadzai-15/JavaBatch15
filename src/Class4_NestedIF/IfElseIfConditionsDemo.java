package Class4;

public class IfElseIfConditionsDemo {
    public static void main(String[] args) {


        int day=2; //Assign a value to a variable

        if(day==1){ // we compare two values
            System.out.println("Monday");  // If Block
        }else if(day==2) {
            System.out.println("Tuesday"); // else block
        }else if (day==3){
            System.out.println("Wednesday");
        } else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        } else if(day==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Wrong day number");//if we use day more than 7 days
        }

    }
}


