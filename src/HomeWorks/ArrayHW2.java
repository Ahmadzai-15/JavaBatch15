package HomeWorks;

public class ArrayHW2 {
    public static void main(String[] args) {
       /* 2) Create an array of names and store all names of your group. Then print your
        name from that array. (use 2 different ways of creating an array).*/

        String names[]={"Lucky", "Mike","Jones","Tony"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);}

            System.out.println("-------------------");

            String name2[]={"Lucky", "Mike","Jones","Tony"};
            for (int j = 0; j <=4 ; j++) {
                System.out.println(name2[j]);

            }

        }
    }

