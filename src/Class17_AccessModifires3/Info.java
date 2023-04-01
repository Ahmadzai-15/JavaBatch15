package Class17_AccessModifires3;

public class Info {
/*Create a class call it Student defive 4 instance field like id name age weight and create
* 5 objects of this class do this task without construction and with construction */
    String iDName;
    int age;
    double weight;

    public static void main(String[] args) {

        Info st=new Info();
        st.iDName="A-11";
        st.age=31;
        st.weight=44.5;
        System.out.println(st.iDName+" "+st.age+" "+st.weight);

        st.iDName="A-22";
        st.age=33;
        st.weight=55.5;
        System.out.println(st.iDName+" "+st.age+" "+st.weight);

        st.iDName="A-33";
        st.age=33;
        st.weight=55.5;
        System.out.println(st.iDName+" "+st.age+" "+st.weight);

        st.iDName="A-44";
        st.age=33;
        st.weight=55.5;
        System.out.println(st.iDName+" "+st.age+" "+st.weight);

        st.iDName="A-55";
        st.age=33;
        st.weight=55.5;
        System.out.println(st.iDName+" "+st.age+" "+st.weight);

    }
}
