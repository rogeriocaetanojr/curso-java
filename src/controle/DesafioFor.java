package controle;

public class DesafioFor {

    public static void main(String[] args) {

        // nao pode usar valor numerico p controlar o laco

        for(String valor = "#"; !valor.equals("######"); valor += "#"){
            System.out.println(valor);
        }
    }
}
