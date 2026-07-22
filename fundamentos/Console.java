package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
       // 3 formas de print
        System.out.print("Bom");
        System.out.print(" dia!\n"); // tem que usar \n p quebrar linha

        System.out.println("Bom");
        System.out.println("dia!"); // ja tem quebra de linha

        System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f\n", 1325.3695); // print com contenacao
        System.out.printf("Nome: %s\n", "Rogério");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = entrada.nextInt();

        System.out.println("Meu nome é: " + nome + " " + sobrenome + " " + "e tenho" + " " + idade + " " + "anos.");
        System.out.printf("Meu nome é: %s %s e tenho %d anos.\n", nome, sobrenome, idade);

        entrada.close();
    }
}
