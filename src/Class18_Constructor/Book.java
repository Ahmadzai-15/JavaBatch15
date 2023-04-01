package Class18_Constructor;

public class Book {
      /*
6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized.
Both Constructors are being executed
     */

    String name;
    String author;
    int price;
    int publishedyear;

    Book(String name1, String author1){
        name=name1;
        author=author1;
    }
    Book(int price1, int publishedyear1){
        price=price1;
        publishedyear=publishedyear1;
    }
    void printinfo(){
        System.out.println("Book Name"+name+"Author Name"+author);
    }
    void printinfo1(){
        System.out.println("Price"+price+"published year"+publishedyear);

    }
}
