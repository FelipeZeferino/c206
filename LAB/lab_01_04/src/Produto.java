public class Produto {
    private String nome;
    private double preco;

    public String etiquetaPreco(){
        return "Nome: " + nome + " Preço: " + preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}
