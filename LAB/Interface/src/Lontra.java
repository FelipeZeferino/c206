public class Lontra extends Mamifero implements Aquático {

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Fazendo som de lontra..");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando..");
    }
}
