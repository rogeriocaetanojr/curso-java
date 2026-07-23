package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        //parte q eu fiz
        //primeira parte do desafio
        int a = 6 * (3 + 2);
        double b = Math.pow(a, 2);
        double c = b / (3*2);

        System.out.println("O resultado da primeira parte é: " + c);

        //segunda parte do desafio

        int d = (1 - 5) * (2 -7);
        int e = d / 2;
        double f = Math.pow(e, 2);

        System.out.println("O Resultado da segunda parte é: " + f);

        //terceira parte

        double h = (c - f);
        double i = Math.pow(h,3);
        double j = Math.pow(10, 3);
        double k = i / j;

        System.out.println("O resultado da terceira parte é: " + k);


        //resolucao do exercicio

        /*double numA = Math.pow(6 * (3+2), 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println("O resultado é: " + resultado);
        */
    }
}
