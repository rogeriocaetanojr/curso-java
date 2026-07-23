package fundamentos;

public class Aritmeticos {
    public static void main(String[] args) {

        double a = 15.50;
        double b = 7.75;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        int c = 8;
        int d = 3;

        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c / d);
        System.out.println(c / (double) d); //transforma inteiro p double p n truncar a divisao
        System.out.println(c % d); //% p mostrar o resto da divisao

    }
}
