package Class20_SuperKeyword_Inhertance;

public class SportTest {
    public static void main(String[] args) {

        Cricket crick=new Cricket("Cricket", "Afghanistan", "Blue Helmet");
        crick.display();

        Soccer soc=new Soccer("Soccer", "Argentina", "Oliver's",12);
        soc.display();
        soc.displayTeam();
    }
}
