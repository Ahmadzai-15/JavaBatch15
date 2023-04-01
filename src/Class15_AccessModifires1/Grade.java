package Class15_AccessModifires1;

public class Grade {

/*6)Create  class Student that will have a method getGrade. Your method should
    accept the score of a student and return a grade:*//*
    score > 90 - A
    score >80 - B
    score >70 - C
    score > 50 - D
    anything else - F*/
    String grade(int num) {
        char grade2;
        if (num >=90 && num<=100) {
            return "A";
        } else if (num>80) {
            return "B";
        }else if(num>70){
            return "C";
        }else if(num>50){
            return "D";
        }else {
            return "F";
        }

    }

    public static void main(String[] args) {
        Grade gr=new Grade();

        System.out.println(gr.grade(100));
    }
}
