package Class13StringBuildDemo;

public class Task3Split {
    public static void main(String[] args) {

        /*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        How would you find out how many sentences are in that String?*/

        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] strArr=str.split("[?]");
        System.out.println(strArr.length);


        //this is simple way to print qustion it save memory
        System.out.println(str.split("[?]").length);
    }
}
