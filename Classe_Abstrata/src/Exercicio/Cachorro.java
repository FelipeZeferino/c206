package Exercicio;

public class Cachorro extends Mamifero {

    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo Latido..");
    }
}