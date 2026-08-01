package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data data1 = new Data(9, "Agosto", 2002);
        //data1.dia = 9;
        //data1.mes = "Agosto";
        //data1.ano = 2002;

        Data data2 = new Data();
        data2.dia = 25;
        data2.mes = "Dezembro";
        data2.ano = 2025;

        Data data3 = new Data(24, "Setembro", 1999);
        //data3.dia = 24;
        //data3.mes = "Setembro";
        //data3.ano = 1999;

        //System.out.printf("A data de nascimento da Kimberly é: %d de %s de %d\n", data1.dia, data1.mes, data1.ano);
        System.out.println("A data de nascismento da Kimberly é: " + data1.obterDataFormatada());
        //System.out.printf("A data de nascimento do Rogério é: %d de %s de %d\n", data3.dia, data3.mes, data3.ano);
        System.out.println("A data de nascimento do Rogério é: " + data3.obterDataFormatada());
        //System.out.printf("A data em que comecei a namorar com a Kimberly é: %d de %s de %d", data2.dia, data2.mes, data2.ano);
        System.out.println("A data em que comecei a namorar com a Kimberly é: " + data2.obterDataFormatada());
    }
}
