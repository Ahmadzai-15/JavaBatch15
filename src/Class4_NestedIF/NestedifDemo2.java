package Class4;

public class NestedifDemo2 {
    public static void main(String[] args) {

        int money = 1000;// to make alt+ctr+L=to complete bracket
        String day = "Sunday";
        boolean mood = true;
        if (money > 700) {
            if (mood) {
                System.out.println("lets go shopping");//if mood if is true then if block will print
            }
        } else {
            System.out.println("Lets save more money first");//if, if block will false then else block will print.
        }

    }
}
