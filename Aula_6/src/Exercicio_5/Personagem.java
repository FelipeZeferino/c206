package Exercicio_5;

public class Personagem {
    String nome;
    int pontos;
    int vida;
    Arma arma;//Agregação

    void usarArmas(){
        this.arma.resistencia -= 2;
    }

    void tomarDano(){
        this.vida -= 5;
    }
}
