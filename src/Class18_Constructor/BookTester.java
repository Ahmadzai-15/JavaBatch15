package Class18_Constructor;

public class BookTester {
    public static void main(String[] args) {
        Book a =new Book("White Tiger","Aravind Adiga");
        Book b=new Book(100,1988);
        a.printinfo();
        a.printinfo1();
    }
}
