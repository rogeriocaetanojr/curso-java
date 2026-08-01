package classe;

public class Data {
    int dia;
    String mes;
    int ano;

    Data(){

    }
    Data(int diaNasc, String mesNasc, int anoNasc) {
        dia = diaNasc;
        mes = mesNasc;
        ano = anoNasc;
    }

    String obterDataFormatada() {
        return String.format("%d/%s/%d", dia, mes, ano);
    }
}
