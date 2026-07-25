package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {
    // Criar um programa que receba um número e diga se ele é um número primo.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else if (numero != 2 && numero % 2 == 0) {
            ehPrimo = false;
        } else {
            for (int num = 3; num < numero; num += 2) {
                if (numero % num == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        if (ehPrimo) {
            System.out.println("O número " + numero + " É primo!");
        } else {
            System.out.println("O número " + numero + " NÃO é primo!");
        }
        entrada.close();
    }
}
