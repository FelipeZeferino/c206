package Exercicio_6;

public class Kart {

Piloto piloto;
String nome;

Motor motor;

    public Kart() {
        motor = new Motor();
    }
    void pular(){
        System.out.println("Pular!");
    }
    void soltarTurbo(){
        System.out.println("Soltar Turbo!");
    }
    void fazerDrift(){
        System.out.println("Fazer Drift!");
    }

}
