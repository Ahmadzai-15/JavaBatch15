package Project2;

public abstract class Mark {

    /*
    * Create calculate the average of marks obtained in three subject by student A and by student B. create
    * class 'Mark' with an abstract method 'getPercentage' that will be returning the average  percentage of marks.
    * provide implementation of abstract method in classes 'A' and 'B'  the constructor of student A takes the mark
    * in three subject as its parameters and the marks in four subjects as its parameter for student B.
    * test you code */
    public abstract double getPercentage();
}

// A class implementing Mark for student A
class A extends Mark {
    private double marks1;
    private double marks2;
    private double marks3;

    public A(double marks1, double marks2, double marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double getPercentage() {
        return (marks1 + marks2 + marks3) / 3;
    }
}

// B class implementing Mark for student B
class B extends Mark {
    private double marks1;
    private double marks2;
    private double marks3;
    private double marks4;

    public B(double marks1, double marks2, double marks3, double marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    public double getPercentage() {
        return (marks1 + marks2 + marks3 + marks4) / 4;
    }
}


