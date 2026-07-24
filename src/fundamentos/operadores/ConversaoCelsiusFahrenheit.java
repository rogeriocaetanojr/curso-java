package fundamentos.operadores;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoCelsiusFahrenheit {

    public static void main(String[] args) {

        // crie um programa que converta celsius para fahrenheit

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite uma temperatura em graus Celsius: ");
        double num = entrada.nextDouble();

        double conversao = num * 1.8 + 32;

        System.out.printf("A conversão em Fahrenheit é: %.2f", conversao);

        entrada.close();
    }
}
