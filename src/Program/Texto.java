package Program;

/**
 * Created by jeffgoes on 3/25/16.
 */
public class Texto {
    String texto;

    public Texto(String texto) {
        this.texto = texto;

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    void Escrever (){
        System.out.println(texto + " ---> SEM FORMATACAO");
    }

    void Escrever (int tipo, String fonte){

        if (tipo == 0)
            System.out.print(tipo + "-->" + " Italico , com fonte " + fonte);
        else if (tipo == 1)
            System.out.print(tipo + "-->" + " Negrito , com fonte " + fonte);
        else if (tipo == 2)
            System.out.print(tipo + "-->" + " Underline , com fonte " + fonte);
    }


    void Escrever (int tipo, String fonte, String cor){
        System.out.print(", na cor " + cor);
   }
}
