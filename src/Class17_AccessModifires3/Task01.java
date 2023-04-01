package Class17_AccessModifires3;

public class Task01 {
    String name;
    int age;
    int salary;
    Task01(String tName, int tAge, int tSalary){

        name=tName;
        age=tAge;
        salary=tSalary;
    }
    void printInfo(){
        System.out.println("Name: "+name+" Age: "+age+ " Salaray: "+salary);
    }

    public static void main(String[] args) {

        Task01 task=new Task01("Selab",23,30000);
        task.printInfo();


    }


}
