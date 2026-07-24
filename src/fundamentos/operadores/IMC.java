package fundamentos.operadores;

import java.util.Locale;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        // crie um programa que leia a altura e o peso do usuario e imprima o IMC

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f", imc);

        entrada.close();
    }
}
