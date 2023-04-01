package Class12StringMethods;

public class StringDemo3_Combine2String {
    public static void main(String[] args) {

        String firsName="Akhter";
        String lastName="Lava";
        String fullName=firsName+" "+lastName; // most widely used
        System.out.println(fullName);
        System.out.println(firsName+" "+lastName);
        System.out.println(firsName.concat(" "+lastName));
    }
}
