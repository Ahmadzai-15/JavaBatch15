package Class18_Constructor;

public class Task1 {

        /*Write a java clsss that have 4 constructor with 4 diffirent access levels
         of costructors (private, public,default and protected) and create 4 objexts of this calss:
         1 inside same class; 2-from outside teh class;
         3-from different class inside different package and obsere result*/

        private Task1(){
            System.out.println("Constructor without any parameters");
        }
        Task1(String name){
            System.out.println("Constructor with a Stirng as parameter");
        }
        protected Task1(int number){
            System.out.println("constructor with an int as parameter");
        }
        public Task1(char C){
            System.out.println("Constructor with a char as parameter");
        }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        Task1 task2=new Task1("Java");
        Task1 task3=new Task1(2000);
        Task1 task4=new Task1('A');
    }


        


}
