public class Jogo implements Comparable<Jogo> {
    private String nome;
    private double preco;
    private String genero;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int compareTo(Jogo o) {
        if(this.preco > o.getPreco()){
            return 1;
        }
        else return 0;
    }
}
