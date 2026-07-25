package controle.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class FechamentoNotas {
    // Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0
    // imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário
    // imprime no console "Reprovado".

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Digite a sua primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.printf("Sua média foi: %.1f", media);

        if (media >= 7 && media <= 10) {
            System.out.println("\nVocê foi aprovado!");
        } else if (media < 7 && media >= 4) {
            System.out.println("\nVocê está de recuperação!");
        } else if (media >= 0 && media < 4) {
            System.out.println("\nReprovado!");
        } else {
            System.out.println("Nota inválida!");
        }
        entrada.close();
    }
}
