package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // conversao implicita
        System.out.println(a);

        float b = (float) 1.123456789123; // conversao explicita (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // conversao explicita (CAST)
        System.out.println(d);

        double e = 1.9999;
        int f = (int) e; // perde dados
        System.out.println(f);
    }
}
