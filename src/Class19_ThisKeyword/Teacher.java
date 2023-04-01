package Class19_ThisKeyword;

public class Teacher {

    String name;
    int teacherId;

    String subject;

    Teacher(String name, int teacherId) {
        this.name = name;
        this.teacherId = teacherId;
    }

    Teacher(String name, int teacherId, String subject) {
        this(name, teacherId);
        this.subject = subject;
    }
}
