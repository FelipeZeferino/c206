public class Main {
    public static void main(String[] args) {

        Personagem []lista = new Personagem[3];
        Personagem mago = new Mago("Gandalf",150, 100, 250);
        Personagem guerreiro = new Guerreiro("Darius",400,250,100);
        Personagem assassino = new Assassino("Talon",250, 300, 200);

        lista[0] = mago;
        lista[1] = guerreiro;
        lista[2] = assassino;



        Arma arma1 = new Arma("Espada Longa", 100);
        Arma arma2 = new Arma("Adaga", 150); //criei armas diferentes na classe pq IDE não está aceitando setArma();

        //armas criadas nas classes guerreiro e assassino pq não tá funcionando

        //guerreiro.setArma(arma1);
        //assassino.setArma(arma2);



        for (int i = 0; i < lista.length; i++) {
            if(lista[i] instanceof Guerreiro){
                System.out.println("GUERREIRO ");
                System.out.println("Nome: " + lista[i].getNome());
                System.out.println("Vida: " + lista[i].getVida());
                ((Guerreiro) lista[i]).atacar(assassino);
            }
            if(lista[i] instanceof Assassino){
                System.out.println("ASSASSINO ");
                System.out.println("Nome: " + lista[i].getNome());
                System.out.println("Vida: " + lista[i].getVida());
                ((Assassino) lista[i]).atacar(guerreiro);
            }
            if(lista[i] instanceof Mago){
                System.out.println("MAGO ");
                System.out.println("Nome: " + lista[i].getNome());
                System.out.println("Vida: " + lista[i].getVida());
                lista[i].usarHabilidade();
            }
        }












    }
}