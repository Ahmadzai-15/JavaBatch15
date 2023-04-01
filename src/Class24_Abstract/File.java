package Class24_Abstract;

public abstract class File {

    int size;
    File(int size){
        this.size=size;
    }
    abstract void open();
    void edit(){

    }
    void close(){
        System.out.println("Closing the file");
    }


}
class JavaFile extends File{

    JavaFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("Opening the file in intellij");
    }

    @Override
    void edit() {
        System.out.println("Editing the file in intellij");
    }
}
class  WordFile extends File{

    WordFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("Oepening the file in Microsoft word");
    }
}
class PDFFile extends File{
    PDFFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("Opening the file in acrobat reader");
    }


}
