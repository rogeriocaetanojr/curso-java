package controle.exercicios;

import java.util.Scanner;

public class JogoAdvinhacao {
    //Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
    //O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de
    // tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.

    public static void main(String[] args) {

        int aleatorio = 24;
        int tentativas = 10;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este é um jogo de advinhação... ");
        System.out.println("Você tem 10 tentativas para advinhar o número de 0 a 100!.");

        while (tentativas > 0) {
            System.out.println("Digite o seu palpite: ");
            int numero = entrada.nextInt();

            if (numero == aleatorio) {
                System.out.println("Você acertou em cheio, parabéns! ");
                break;
            }
            tentativas--;

            if (tentativas == 0) {
                System.out.println("Game over! O numéro era: " + aleatorio);
                break;
            }

            if (numero > aleatorio) {
                System.out.printf("Você errou! O número é MENOR. Você tem mais %d tentativas.\n", tentativas);
            } else {
                System.out.printf("Você errou! O número é MAIOR. Você tem mais %d tentativas.\n", tentativas);
            }
        }

        entrada.close();
    }
}
