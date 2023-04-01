package Class20_SuperKeyword_Inhertance;

public class Phone {

    String company;
    int rate;

    Phone(String company,int rate){
        this.company=company;
        this.rate=rate;
    }
    void phoneprint(){
        System.out.println("The Company is "+company+" Charge Per Minute "+rate+" Afs");
    }

}
class Etisalat extends Phone{

    int zipCode;
    double rate2;

    Etisalat(String company,int rate,int zipCode,double rate2){
        super(company,rate);
        this.zipCode=zipCode;
        this.rate2=rate2;
    }
    void etisalat(){
        System.out.println( "Company name is "+company+" ZipCode is "+ zipCode+" Charge Rate Per Minutes "+rate2+" Afs");
    }

}
