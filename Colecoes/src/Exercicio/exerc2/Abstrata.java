package Exercicio.exerc2;

public abstract class Abstrata implements Comparable<Abstrata>{
    private String nome;
    private int codigo;

    public Abstrata(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Abstrata o) {
       return Integer.compare(o.getCodigo(),this.codigo);
    }
}
