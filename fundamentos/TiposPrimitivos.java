package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // informacoes do funcionario

        // tipos numericos
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L; //L p mostrar que é um literal long

        // tipos numericos reais
        float salario = 11_445.44F; //F indicia que é um literal float
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano
        boolean estaDeFerias = false; // ou true

        // tipo caractere
        char status = 'A'; //ativo

        // dias de empresa
        System.out.println("O funcionario tem: " + (anosDeEmpresa * 365) + " dias de empresa.");

        // numero de viagens
        System.out.println("O funcionario tem: " + numeroDeVoos / 2 + " voos pela empresa.");

        // pontos por real
        System.out.println("O funcionario tem: " + pontosAcumulados / vendasAcumuladas + " pontos acumulados.");

        System.out.println("O Id: " + id + ": ganha -> " + "R$"+salario);

        System.out.println("Férias? " + estaDeFerias);

        System.out.println("Status: "+ status);
        //

    }
}
