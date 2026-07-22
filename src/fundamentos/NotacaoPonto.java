package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Rogério");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        System.out.println("Javeiro".toUpperCase());

        String y = "Bom dia X".replace("X", "Javeiro").toUpperCase().concat("!!!");
        System.out.println(y);

        // tipos primitivos nao tem o operador "."

        // to.UpperCase() deixa a parte que quiser ou tudo maiusculo
        // .concat adiciona trechos onde quiser
        // replace troca trechos, como por exemplo o X por Rogério/Javeiro
    }
}
