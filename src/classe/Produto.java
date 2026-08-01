package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    //construtor
    Produto() {

    }

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    //metodo
    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
