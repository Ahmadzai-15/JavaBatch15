package Class20_SuperKeyword_Inhertance;

public class Teacher {

    public String teacherName;
    public String teacherId;

    public void homework() {
        System.out.println("Homeworks make students perfect!!!!");
    }

    protected void grade() {
        System.out.println("Grade doesn't matter");
    }

    void scholarship() {
        System.out.println("Good students from this class will get scholarship");
    }

    private void extraPoint() {
        System.out.println("All students attend the class will get extra point");
    }
}

class MathTeacher extends Teacher{
    String subject;
    String grade;

    void excellent(){
        System.out.println("This class is excellent");
    }
}

class ChemistryTeacher extends Teacher{
    String homework;
    String test;

    void science(){
        System.out.println("Chemistry class is fun");
    }
}

class Pianoteacher extends Teacher{
    String classic;
    String schedule;

    void happy(){
        System.out.println("This class make students happy");
    }
}
