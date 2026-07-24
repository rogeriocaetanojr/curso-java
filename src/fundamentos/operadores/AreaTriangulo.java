package fundamentos.operadores;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        // crie um programa que leia a base, a altura de um triangulo e calcule a area

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite o valor da base do triangulo: ");
        double base = entrada.nextDouble();

        System.out.println("Digite o valor da altura do triangulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura / 2;

        System.out.printf("A area do triangulo é de : %.2fcm2", area);

        entrada.close();
    }
}
