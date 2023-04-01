package Class12StringMethods;

public class Reversed01 {

  String name(String rev){
      String str="";
      for (int i = rev.length()-1; i >=0 ; i--) {
          str+=rev.charAt(i);
      }
      return str;
  }



    public static void main(String[] args) {
        Reversed01 rev1=new Reversed01();
        System.out.println(rev1.name("Selab"));




        //Simple Reversed String withOut Creating Method.
       String school="Syntax";
       String str1="";
        for (int i = school.length()-1; i >=0 ; i--) {
            str1+=school.charAt(i);
        }
        System.out.println(str1);

    }
}
