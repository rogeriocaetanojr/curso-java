package fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        // byte
        Byte a = 100;
        Short b = 1000;
        Integer c = 10000; // int
        Long d = 100000L; // o 'L' indica que o literal é um Long

        System.out.println(a.byteValue()); // retorna o valor primitivo byte guardado dentro de 'a'
        System.out.println(b.toString()); // converte o número 1000 em uma String "1000"
        System.out.println(c * 3); // tira o int de dentro do Integer 'c' pra fazer a conta
        System.out.println(d / 3); // divisão inteira usando o Long

        // float
        Float e = 123.0F; // o 'F' é obrigatório para o Java saber que é float (senão ele entende como double)
        System.out.println(e);

        // double
        Double g = 1234.5678;
        System.out.println(g);

        // boolean
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        // char
        Character f = '$';
        System.out.println(f + "..."); // concatena o caractere '$' com a String "..." -> "$..."


    }
}
