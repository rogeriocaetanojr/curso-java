package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3499.00;
        p1.desconto = 0.15;

        Produto p2 = new Produto();
        p2.nome = "Placa de vídeo";
        p2.preco = 2749.99;
        p2.desconto = 0.10;

       // double valorDescontoP1 = p1.preco * p1.desconto;
        double valorFinalP1 = p1.precoComDesconto();

        //double valorDescontoP2 = p2.preco * p2.desconto;
        double valorFinalP2 = p2.precoComDesconto();

        System.out.printf("O preço do Notebook com o desconto aplicado é de: R$%.2f \n", valorFinalP1);
        System.out.printf("O preço da Placa de Vídeo com o desconto aplicado é de: R$%.2f ", valorFinalP2);
    }
}
