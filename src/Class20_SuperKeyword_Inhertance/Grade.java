package Class20_SuperKeyword_Inhertance;

public class Grade {

    int grade1;
    int grade2;

    Grade(int grade1, int grade2){
        this.grade1=grade1;
        this.grade2=grade2;
    }
    void parent(){
        System.out.println( grade2+  grade2);
    }
}

class Grade2 extends Grade {

    int grade3;
    int grade4;
    Grade2(int grade1, int grade2,int grade3, int grade4){
        super(grade1,grade2);
        this.grade3=grade3;
        this.grade4=grade4;
    }
    void print2(){
        System.out.println((grade3+grade4+grade1+grade2)/4);
    }
}
