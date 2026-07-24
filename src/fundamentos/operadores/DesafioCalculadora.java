package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // ler num1
        // ler num2
        // pedir qual operacao quer fazer ( + || - || * || / || % )

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite outro numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Qual operação matemática você quer fazer? ( + | - | * | / | % ) ");
        String conta = entrada.next();

        // logica do programa
        double resultado = "+".equals(conta) ? num1 + num2 : 0;
        resultado = "-".equals(conta) ? num1 - num2 : resultado;
        resultado = "*".equals(conta) ? num1 * num2 : resultado;
        resultado = "/".equals(conta) ? num1 / num2 : resultado;
        resultado = "%".equals(conta) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f =  %.2f", num1, conta, num2, resultado);

        entrada.close();
    }
}
