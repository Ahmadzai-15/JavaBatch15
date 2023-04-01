package Class17_AccessModifires3;

public class Student {
    /*Create a class call it Student define 4 instance field like id name age weight and create
     * 5 objects of this class do this task without construction and with construction */
    String id;
    String Name;
    int age;
    double weight;
    Student(String sName, String sId,int sAge, double sWeight){
        id=sId;
        Name=sName;
        age=sAge;
        weight=sWeight;
    }
    void print(){
        System.out.println(Name+" "+id+" "+age+" "+weight);

}
}
