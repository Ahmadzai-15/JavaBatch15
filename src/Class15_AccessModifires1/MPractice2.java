package Class15_AccessModifires1;

public class MPractice2 {

    //create a method that taeks a Sting reverse it and return the reversed String
    //call the method reverse.

    //Hard Code== 1-return String 2-String 3-reverseStr
    String reverseStr(String input){
        String newStr="";
        for (int i =input.length()-1; i >=0; i--) {
            newStr+=input.charAt(i);
        }
        return newStr;
    }
    public static void main(String[] args) {
        MPractice2 task2=new MPractice2();
        System.out.println(task2.reverseStr("AFGHANISTAN"));


    }
}
