package Class16_AccessModifires2;

public class Person {
    private double bankBlance=125;
    String address="Stree 123"; //Default access level is applied.
    public String Name="John Snow";
    void printPhonePassowrd(){
        System.out.println("12344");
    }
void printSSN(){
    System.out.println("23434324234");
}
 public void printTikTokAccount(){
    System.out.println("Selab2023");
}
    public static void main(String[] args) {
        Person person=new Person();
        person.printPhonePassowrd();
        person.printSSN();
        person.printTikTokAccount();
        System.out.println(person.bankBlance);
        System.out.println(person.address);
        System.out.println(person.Name);

    }
}
