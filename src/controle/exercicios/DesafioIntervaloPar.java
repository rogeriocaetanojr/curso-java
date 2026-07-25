package controle.exercicios;

import java.util.Scanner;

public class DesafioIntervaloPar {

    public static void main(String[] args) {
        // criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();

        if (num >= 0 && num <= 10) {
            System.out.println("Esse numero está entre 0 e 10! ");
            if (num % 2 == 0) {
                System.out.println("O numero é par!");
            } else {
                System.out.println("O numero é impar!");
            }
        } else {
            System.out.println("Numero fora do range!");
        }
        entrada.close();
    }
}