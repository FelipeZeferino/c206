public abstract class Personagem {
    private String nome;
    private int vida;
    private int energia;
    private int poder;

    public Personagem(String nome, int vida, int energia, int poder){
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.poder = poder;
    }

    public String getNome(){
        return this.nome;
    }

    public int getVida(){
        return this.vida;
    }

    public void tomarDano(int dano){
        this.vida -= dano;
    }

    void usarHabilidade(){
        System.out.println("Usando habilidade");
    }
}
