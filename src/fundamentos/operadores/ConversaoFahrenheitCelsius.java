package fundamentos.operadores;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoFahrenheitCelsius {

    public static void main(String[] args) {

        // crie um programa que leia a temperatura em fahrenheit e converta para celsius

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double num1 = entrada.nextDouble();

        double conversao = (num1 - 32) * 5 / 9;

        System.out.printf("A temperatura em celsius é: %.2f ", conversao);

        entrada.close();
    }
}
