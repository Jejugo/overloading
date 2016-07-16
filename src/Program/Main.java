package Program;

/**
 * Created by jeffgoes on 3/25/16.
 */
public class Main {
    public static void main (String [] args){

        Texto t = new Texto("Quero escrever isso");

       // NOT FORMATTED
        t.Escrever();

        System.out.println("\n");

        //FORMATTED (0 - italic ; 1 - bold; 2 - underline)
        t.Escrever(0, "Arial");


        t.Escrever(2, "Arial Black", "Vermelho");


    }
}
