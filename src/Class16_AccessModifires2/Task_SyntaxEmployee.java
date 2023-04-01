package Class16_AccessModifires2;

public class Task_SyntaxEmployee {
    /*Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects*/

    int id;
    int salary;
    static String cEO="Sumair";


    public static void main(String[] args) {
        Task_SyntaxEmployee se=new Task_SyntaxEmployee();


        se.id=1233;
        se.salary=30000;


        Task_SyntaxEmployee se2=new Task_SyntaxEmployee();

        se2.salary=4000;
        se2.id=2333;

        System.out.println("Salary "+se.salary+" ID "+se.id+" CEO "+se.cEO);


    }
}
