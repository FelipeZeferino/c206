package Exercicio;

public class Main {
    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro("Bolt", 100);
        Mamifero lontra = new Lontra("Gisk",50);
        Mamifero boi = new Boi("Boizao",150);

        cachorro.emitirSom();
        cachorro.mostraInfo();

        lontra.emitirSom();
        lontra.mostraInfo();

        boi.emitirSom();
        boi.mostraInfo();
    }


}
