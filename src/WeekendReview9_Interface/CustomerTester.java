package WeekendReview9_Interface;

public class CustomerTester {
    public static void main(String[] args) {


        Customer c=new Customer();
        c.setName("selab");
        System.out.println("Name of customer "+c.getName());

        c.setSsn(234345888);
        System.out.println("SSN of customer "+c.getSsn());


    }
}
