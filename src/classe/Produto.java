package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    //construtor
    Produto() {

    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    //metodo
    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
