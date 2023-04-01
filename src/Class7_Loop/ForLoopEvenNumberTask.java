package Class7_Loop;

public class ForLoopEvenNumberTask {
    public static void main(String[] args) {



        for( int a=0; a<=20;a+=2){ // this is the better approach to use this method than bellow one
            System.out.println(a+" ");
        }



        for( int i=1; i<=20;i++){
            if(i%2==0)
            System.out.println(i);}
}
}
