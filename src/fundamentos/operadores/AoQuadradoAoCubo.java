package fundamentos.operadores;

import java.util.Locale;
import java.util.Scanner;

public class AoQuadradoAoCubo {

    public static void main(String[] args) {

        // crie um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite um numero: ");
        double num = entrada.nextDouble();

        double a2 = num * num;
        double a3 = num * num * num;

        System.out.printf("Esse numero ao quadrato é: %.2f", a2);
        System.out.printf("\nEsse numero ao cubo é: %.2f", a3);

        entrada.close();
    }
}
