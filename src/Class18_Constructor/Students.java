package Class18_Constructor;

public class Students {
    //2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade.
    //Test Student class for 5 different students with different marks.
    //Your program should print an average mark of each students name.
    //NOTE: please use different names for instance and local variables.

    String name;
    int grade1;
    int grade2;
    int grade3;
    double average;

    Students(String name1, int gradeOne, int gradeTwo, int gradeThree) {
        name = name1;
        grade1 = gradeOne;
        grade2 = gradeTwo;
        grade3 = gradeThree;
        average = ((grade1 + grade2 + grade3) / 3);
    }

    void callstud() {
        System.out.println(" Student Name " + name + " Average " + average);
    }
}