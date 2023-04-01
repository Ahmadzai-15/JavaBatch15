package Class20_SuperKeyword_Inhertance;
    public class Employee {
        private String name;
        private int employeeId;
        private double salary;

        public Employee(String name, int employeeId, double salary) {
            this.name = name;
            this.employeeId = employeeId;
            this.salary = salary;
        }

        public void displayDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Salary: " + salary);
        }
    }

    class FullTimeEmployee extends Employee {
        private int workingHours;

        public FullTimeEmployee(String name, int employeeId, double salary, int workingHours) {
            super(name, employeeId, salary);
            this.workingHours = workingHours;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("Working Hours: " + workingHours);
        }
    }

    class PartTimeEmployee extends Employee {
        private int workingHours;
        private double hourlyRate;

        public PartTimeEmployee(String name, int employeeId, double salary, int workingHours, double hourlyRate) {
            super(name, employeeId, salary);
            this.workingHours = workingHours;
            this.hourlyRate = hourlyRate;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Hourly Rate: " + hourlyRate);
        }
    }

    class Tester extends FullTimeEmployee {
        private String language;

        public Tester(String name, int employeeId, double salary, int workingHours, String language) {
            super(name, employeeId, salary, workingHours);
            this.language = language;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("Programming Language: " + language);
        }



        public static void main(String[] args) {
            FullTimeEmployee fte = new FullTimeEmployee("John", 12345, 50000, 8);
            PartTimeEmployee pte = new PartTimeEmployee("Jane", 67890, 25, 4, 15);
            Tester t = new Tester("Jim", 11111, 55000, 8, "Java");

            System.out.println("Full Time Employee Details:");
            fte.displayDetails();
            System.out.println();

            System.out.println("Part Time Employee Details:");
            pte.displayDetails();
            System.out.println();

            System.out.println("Tester Details:");
            t.displayDetails();
        }
    }

