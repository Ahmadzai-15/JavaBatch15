package Class20_SuperKeyword_Inhertance;

public class TeacherTest {
    public static void main(String[] args) {


        Teacher tc=new Teacher();
        tc.teacherName="Babara";
        tc.teacherId="T121";

        System.out.println("This is principal "+tc.teacherName);
        //tc.extraPoint(); this is private

        MathTeacher mt=new MathTeacher();
        mt.teacherName="Luna";
        mt.teacherId="M221";
        mt.subject="Math";
        System.out.println("Teacher "+mt.teacherName+" teach "+ mt.subject);
        mt.excellent(); //comes from child class
        mt.homework(); //comes from the parent
    }

    }

