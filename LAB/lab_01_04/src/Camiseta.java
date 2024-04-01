public class Camiseta extends Produto{
    private String cor;
    private String tamanho;

    public Camiseta(String cor,String tamanho, String nome, double preco)
    {
        this.cor = cor;
        this.tamanho = tamanho;
        setNome(nome);
        setPreco(preco);
    }

    @Override
    public String etiquetaPreco(){
        return super.etiquetaPreco() + " Cor: " + this.cor + " Tamanho: " + this.tamanho;
    }
}
