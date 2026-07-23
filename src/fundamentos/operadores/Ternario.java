package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        double nota = scanner.nextDouble();
        String resultadoParcial = nota >= 5.0 ? "em recuperação" : "reprovado";
        String resultadoFinal = nota >= 7.0 ? "aprovado" : "em recuperação";

        System.out.println("O Aluno está " + resultadoFinal);
    }
}
