package Replit;

public class Replit135 {

    public static int countA(String s){
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='A' || s.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countA("aaaaA"));
        System.out.println(countA("aaaaBAAAa "));
    }


}
