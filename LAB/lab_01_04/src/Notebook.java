public class Notebook extends Produto{
    private double armazenamento;
    private String gpu;
    private String processador;

    public Notebook(double armazenamento, String gpu, String processador, String nome, double preco)
    {
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
        setNome(nome);
        setPreco(preco);
    }


    @Override
    public String etiquetaPreco(){
        return super.etiquetaPreco() + " Armazenamento: " + this.armazenamento + " GPU: " + this.gpu + " Processador: " + this.processador;
    }
}
