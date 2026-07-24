package controle;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Digite um numero: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("O numero é par!");
        } else {
            System.out.println("O numero é ímpar");
        }
    }
}
