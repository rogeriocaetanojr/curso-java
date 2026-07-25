package controle;

import java.util.Locale;
import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String suaNota = "";
        entrada.useLocale(Locale.US);
        System.out.println("Digite sua nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10:
            case 9:
                suaNota = "A";
                break;
            case 8:
            case 7:
                suaNota = "B";
                break;
            case 6:
            case 5:
                suaNota = "C";
                break;
            case 4:
            case 3:
                suaNota = "D";
                break;
            case 2:
            case 1:
                suaNota = "E";
                break;
            case 0:
                suaNota = "F";
                break;
            default:
                suaNota = "Inválida!";
        }

        System.out.println("Sua nota é: " + suaNota);
        entrada.close();
    }
}
