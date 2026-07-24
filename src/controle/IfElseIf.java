package controle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite sua nota: ");
        double nota = entrada.nextDouble();

        if(nota <0 || nota >10){
            System.out.println("Nota Inválida!");
        } else if(nota >= 8.5){
            System.out.println("Sua nota é A!");
        }else if(nota >= 7){
            System.out.println("Sua nota é B!");
        }else if(nota >= 5.5){
            System.out.println("Sua nota é C!");
        }else if(nota >= 4){
            System.out.println("Sua nota é D!");
        }else if(nota >= 2.5){
            System.out.println("Sua nota é E!");
        }else if(nota < 2.5){
            System.out.println("Sua nota é F!");
        }

        System.out.println("Fim!");

        entrada.close();
    }
}
