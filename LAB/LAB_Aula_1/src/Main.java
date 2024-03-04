public class Main {
    public static void main(String[] args) {
        //constructor == Funcionario() {
        //         System.out.println("Funcionário efetivado");
        //}
        /*
        Agregação -
        Ao criar uma nave, ela pode ter uma arma
        Arma arma;
        ----
        Composição - ao criar uma nave, ela tem uma arma
        Arma arma = new Arma();
        *  */
    //Instanciando classes
    Produto produto1 = new Produto();
    Produto produto2 = new Produto();

    //Atribuindo Valores
    produto1.quantidade = 100;
    produto1.categoria = "Eletrodoméstico";
    produto1.codigoProduto = "1";
    produto1.codigoSerie = 111;
    produto1.nome = "Lava-Louças";

    produto2.quantidade = 55;
    produto2.categoria = "Brinquedo";
    produto2.codigoProduto = "2";
    produto2.codigoSerie = 555;
    produto2.nome = "Boneca";

    //Printando valores
    produto2.mostraInfo();
    produto1.mostraInfo();
    }
}