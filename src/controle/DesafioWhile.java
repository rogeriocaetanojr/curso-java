package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        // calcule a media de notas de uma turma
        // nao sabe quantos alunos tem na turma
        // armazenar nota de >= 0 <= 10 armazenar nota em variavel total e sempre q nota for digitada, acrescenta no total
        // outra variavel quantas notas validas
        // final mostrar a media
        // -1 para sair do programa

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double nota = 0;
        double total = 0;
        int qtdNotas = 0;

        while (nota != -1){
            System.out.print("Informe a nota do (ou digite -1 para sair): ");
            nota = entrada.nextDouble();

            if (nota >=0 && nota <=10){
                total += nota;
                qtdNotas++;
            } else if(nota != -1){
                System.out.println("Nota inválida!");
            }
        }

        double media = total / qtdNotas;
        System.out.printf("A média das notas é: %.2f", media);

        double totalNotas = qtdNotas;
        System.out.println("\nTotal de notas: " + qtdNotas);

        entrada.close();
    }
}
