package Class29_Set;

import java.util.HashMap;
import java.util.HashSet;

public class HW2 {
    public static void main(String[] args) {
        //Create a Set collection that will hold Objects of Student Type.
        //In this set we do not care about the insertion order. Each student object should
        // have name and studentID. Display name of each student

        HashSet<Student>student=new HashSet<>();

        student.add(new Student("John",001));
        student.add(new Student("James",002));
        student.add(new Student("Tony",003));
        student.add(new Student("Mike",004));

        for(Student st:student){
            System.out.println(st);
        }

        System.out.println(student);
    }
}

class Student{

    private String name;
    private int studentID;

    public Student(String name, int studentID){
        this.name=name;
        this.studentID=studentID;
    }
    public String getname(){
        return name;
    }


    public int getStudentID() {
        return studentID;
    }
}