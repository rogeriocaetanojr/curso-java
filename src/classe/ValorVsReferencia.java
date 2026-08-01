package classe;

public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a; // atruibuicao por valor

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, "Junho", 2025);
        Data d2 = d1; // atribuicao por referencia

        d1.dia = 31;
        d2.mes = "Julho";
        d1.ano = 2006;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = "Janeiro";
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a){
        a++;
    }
}
