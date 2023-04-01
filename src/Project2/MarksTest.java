package Project2;

// Testing code
public class MarksTest {
    public static void main(String[] args) {
        Mark student1 = new A(98, 100, 99);
        Mark student2 = new B(98, 100, 90, 95);

        System.out.println("Student 1 percentage is:  " + student1.getPercentage());
        System.out.println("Student 2 percentage is:  " + student2.getPercentage());
    }
}
