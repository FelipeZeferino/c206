public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("Camiseta", 800);
        Produto produto2 = new Produto("Calça", 500);
        Produto produto3 = new Produto("Tênis", 1000);

        carrinho.produtos.add(produto1);
        carrinho.produtos.add(produto2);
        carrinho.produtos.add(produto3);

        carrinho.produtos.sort(Produto::compareTo);

        carrinho.mostraCarrinho();
    }
}