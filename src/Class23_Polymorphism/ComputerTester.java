package Class23_Polymorphism;

public class ComputerTester {
    public static void main(String[] args) {

        Computer computer=new Computer();

        Computer[]laptops={new Computer(),new Lenovo(),new HP(),new Dell()};
         for(Computer laptop: laptops){
             laptop.hardDisk();
             laptop.RAM();
             laptop.screenSize();
         }
    }
}
