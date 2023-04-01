package Class15_AccessModifires1;

public class MPractice6 {
    /*Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address. Example:  createEmail(John, Snow, gmail)
    → johnsnow@gmail.com*/

    String email(String name, String lastName, String email) {
        return name+ lastName+ "@" + email + ".com";
    }

    public static void main(String[] args) {
        MPractice6 mp=new MPractice6();
        System.out.println(mp.email("selab","ahamdzai" , "gmail" ));
    }
}
