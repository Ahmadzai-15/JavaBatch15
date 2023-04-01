package Class18_Constructor;

public class StudentsTester {
    public static void main(String[] args) {
        Students std=new Students("Selab",100,99,100);
        Students std1=new Students("Ahmadzai",90,75,100);
        Students std2=new Students("Najwa",99,90,77);
        Students std3=new Students("Nangyali",80,70,90);
        Students std4=new Students("Bogha",90,90,95);
        std.callstud();
        std1.callstud();
        std2.callstud();
        std3.callstud();
        std4.callstud();
    }
}

