package controle.exercicios;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        // Criar um programa informa se o ano atual é um ano bissexto;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um ano para descobrir se ele é Bissexto: ");
        int ano = entrada.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.printf("O ano %d é Bissexto", ano);
        } else {
            System.out.printf("O ano %d não é Bissexto", ano);
        }
        entrada.close();
    }
}
