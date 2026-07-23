package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        //trabalho terça (v ou f)
        //trabalho quinta (v ou f)
        // dois trabalhos, se um acontecer compra uma tv de 32
        // se os dois trabalhos compra tv 50
        // ou comprando tv de 50 ou de 32, familia toma sortvete

        boolean trabalhoT = false;
        boolean trabalhoQ = false;

        boolean comprouTv50 = trabalhoT && trabalhoQ;
        boolean comprouTv32 = trabalhoT ^ trabalhoQ;
        boolean tomouSorvete = trabalhoT || trabalhoQ;
        boolean maisSaudavel = !tomouSorvete;

        System.out.println("Comprou a Tv de 50? " + comprouTv50);
        System.out.println("Comprou a Tv de 32? " + comprouTv32);
        System.out.println("Tomou sorvete com a familia? " + tomouSorvete);
        System.out.println("Não comprou a tv e nem tomou sorvete para ficar mais saudavel. :( " + maisSaudavel);

        // resposta do desafio
        /*
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        System.out.println("Comprou TV 50\"? " + comprouTV50);
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        boolean comprouSor = trabalho1 || trabalho2;
        System.out.println("Comprou sorvete? " + comprouSor);
        boolean maisSaud = !comprouSor;
        System.out.println("Mais saudavel " + maisSaud);
        */
    }
}
