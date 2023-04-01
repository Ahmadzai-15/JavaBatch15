package HomeWorks;

public class D2ArrayHW {
    public static void main(String[] args) {
        String[][] country={{"Maxeco","USA","Canada"},
                             {"Brazil","peru","Chile"},
                            {"China","India","Japan"}};

        int counter=0;
        for (int i = 0; i <country.length ; i++) {
            for (int j = 0; j <country[i].length ; j++) {


                System.out.println(country[i][j]);
                counter++;
            }
            System.out.println();
        }
        System.out.println(counter); // it count the array size of contains
    }
}
