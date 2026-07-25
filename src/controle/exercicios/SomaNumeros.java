package controle.exercicios;

import java.util.Scanner;

public class SomaNumeros {

    //Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos,
    // caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;
        int soma = 0;

        System.out.println("Esse programa soma os numeros positivos em que você digita.");
        System.out.println("Para sair do programa, digite um número negativo.");

        do {
            System.out.println("Digite um número: ");
            num = entrada.nextInt();

            if (num >= 0) {
                soma += num;
                System.out.println("A soma atual é: " + soma);
            }
        } while (num >= 0);
        System.out.println("\nPrograma finalizado!");
        System.out.println("A soma total dos números inseridos foi de: " + soma);

        entrada.close();
    }
}
