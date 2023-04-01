package Class8_NestedLoop;

public class BreakKeyWorldDemo1 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while(summer){
            if(temp<=100){
                System.out.println("i love summer bcz Temperature "+temp);
            }else{
                System.out.println("its very hot"+ temp);
                break;
            }
            temp+=5;
        }

    }
}
