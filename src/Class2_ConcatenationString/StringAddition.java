package Class2_ConcatenationString;

public class StringAddition {
    public static void main(String[] args) {
        String FirstName="Selab";
        String LastName="Ahmadzai";
        System.out.println(FirstName+" "+LastName);// we can use anoter string option to give command without
        //adding first tow string of(firstname+lastname).
        String fullName= FirstName+" "+LastName;
        System.out.println(fullName);// or we can bring some changing in before print command as bellow
        System.out.println("***"+fullName+"***");//in String we only use "+" Opreator with char,Int,float and double as well.
        System.out.println(FirstName+10);
        System.out.println(FirstName+0.5);
        System.out.println(FirstName+true);
    }
}
