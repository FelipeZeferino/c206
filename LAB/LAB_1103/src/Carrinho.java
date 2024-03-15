public class Carrinho {


    double total;
    Produtos[] Produto1 = new Produtos[5];




    void exibirInfos(){
        System.out.println(Produto1[0].nome);
        System.out.println(Produto1[0].descricao);
        System.out.println(Produto1[0].preco);
        System.out.println(Produto1[0].fabricante);
    }
    double calculaTotal(){
        return Produto1[0].preco;
    }

}
