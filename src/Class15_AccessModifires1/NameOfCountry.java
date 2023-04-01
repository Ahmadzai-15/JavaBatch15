package Class15_AccessModifires1;

public class NameOfCountry {

    //Create a method that will say Hello in different language based on the country that will
    // passed when method is executed

    String helloByCountry(String country){
        switch (country){
            case "USA":
                return "Hello";

            case "AFGHANISTAN":
                return "Pakhir Raghli";

            case "brazil":
                return "Ola";

            case "france":
                return "bonjour";

            default:
                return "country is unknown";
        }
    }

    public static void main(String[] args) {
        NameOfCountry task4=new NameOfCountry();

        System.out.println(task4.helloByCountry("AFGHANISTAN"));
    }
}














