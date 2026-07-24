package controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String algo = "";
        System.out.println("Digite a vontade, caso queira parar digite > sair < ");

        while (!algo.equalsIgnoreCase("Sair")){
            System.out.printf("Rogério: ");
            algo = entrada.nextLine();
        }
        entrada.close();
    }
}
