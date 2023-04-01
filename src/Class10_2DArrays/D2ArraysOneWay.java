package Class10_2DArrays;

public class D2ArraysOneWay {
    public static void main(String[] args) {
        //a 2D arrays which can hold 3 one D arrays ease of size 3
        String[]cabine1={"Adam","Zafar","Sam"};
        String[]cabine2={"Nabi","Saud","Aness"};
        String[]cabine3={"Safi","Abera","Zahra"};
        String[][] tomasTrain=new String[3][3];

        tomasTrain[0]=cabine1;
        tomasTrain[1]=cabine2;
        tomasTrain[2]=cabine3;
        System.out.println(tomasTrain[0][1]);
        System.out.println("***********************");






    }
}
