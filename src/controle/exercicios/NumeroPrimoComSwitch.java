package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimoComSwitch {
    // Refatorar o exercício 04, utilizando a estrutura switch.

    public static void main(String[] args) {

        int contDivisor = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        if (numero <= 1) {
            contDivisor++;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contDivisor++;
                break;
            }
        }

        switch (contDivisor) {

            case 0:
                System.out.println("O numero " + numero + " é um numero primo!");
                break;

            default:
                System.out.println("O numero " + numero + " não é um numero primo!");
        }
        entrada.close();
    }
}
