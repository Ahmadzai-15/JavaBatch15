package Class22_OverRiding;

public class EmployeeTester {
    public static void main(String[] args) {

        Manager manager=new Manager();
        manager.printSalary();
        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.printSalary();
        Developer dev=new Developer();
        dev.printSalary();


    }
}
