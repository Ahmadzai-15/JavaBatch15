package Class13StringBuildDemo;

public class StringVsStringBuilder {
    public static void main(String[] args) {



        StringBuilder str= new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            str.append(i);
        }
    }
}
