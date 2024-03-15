public class Main {
    public static void main(String[] args) {
        Carrinho c1 = new Carrinho();

        c1.Produto1[0] = new Produtos();
        c1.Produto1[0].preco = 90;
        c1.Produto1[0].descricao = "Ar condicionado 9000 BTUs";
        c1.Produto1[0].fabricante = "Samsung";
        c1.Produto1[0].nome = "Ar condicionado FreeWind";

        double aux = c1.calculaTotal();

        System.out.println(c1.Produto1[0].fabricante);
        System.out.println(c1.Produto1[0].nome);
        System.out.println(c1.Produto1[0].descricao);
        System.out.println(c1.Produto1[0].preco);

        System.out.println("Total: " + aux);

    }
}