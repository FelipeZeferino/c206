public class Assassino extends Personagem implements LutarComArmas{

    private Arma arma = new Arma("Adaga",60);

    public Arma getArma() {
        return arma;
    }

    public void setArma(String nome, int dano) {
        this.arma.nome = nome;
        this.arma.dano = dano;
    }

    public Assassino(String nome, int vida, int energia, int poder) {
        super(nome, vida, energia, poder);
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println("Atacando..");
        personagem.tomarDano(this.arma.dano);
    }

}
