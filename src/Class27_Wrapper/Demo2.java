package Class27_Wrapper;

public class Demo2 {
    public static void main(String[] args) {
        String name="Urwa";
        String[] names={"Hiral","Nima","Laura","Nat"};
        // create a method which can search a name from this array return true if name is present in the array
        System.out.println(contains(name,names));
        String[] arr= new String[2];

        names[4]="Shah";

    }

    public static boolean contains(String nameToBeSearched,String[] names){
        for (String name:names) {
            if(nameToBeSearched.equals(name)){
                return true;
            }
        }
        return false;
    }
}
