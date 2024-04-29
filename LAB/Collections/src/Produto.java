import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto p) {
        return Integer.compare((int)this.getPreco(),(int) p.getPreco());
    }
}
