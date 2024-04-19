public class Guerreiro extends Personagem implements LutarComArmas{

     private Arma arma = new Arma("Espada longa", 50);
     
    public Guerreiro(String nome, int vida, int energia, int poder) {
        super(nome, vida, energia, poder);
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void atacar(Personagem personagem) {
        System.out.println("Atacando..");
        personagem.tomarDano(this.arma.dano);
    }
}
