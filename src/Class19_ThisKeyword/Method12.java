package Class19_ThisKeyword;

public class Method12 {
    public static void main(String[] args) {


        String name = " NADAN";

        StringBuilder st=new StringBuilder(name);
        st.reverse();
        String reversed=st.toString();
        if(name.equals(reversed)){
            System.out.println(name+"palindorm");
        }else{
            System.out.println(name+"not palindorme");
        }

    }


}






