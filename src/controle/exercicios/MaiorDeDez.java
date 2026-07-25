package controle.exercicios;

import java.util.Scanner;

public class MaiorDeDez {
    //Crie um programa que recebe 10 valores e ao final imprima o maior número.

    public static void main(String[] args) {

        int maiorValor = 0;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite um valor: ");
            int valor = entrada.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }
            contador++;
        } while (contador != 10);

        System.out.println("O maior valor foi " + maiorValor);

        entrada.close();
    }
}
