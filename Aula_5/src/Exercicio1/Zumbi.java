package Exercicio1;

public class Zumbi {

    //Membros da classe
    int vida;
    String tipo;
    String nome;
    int forca;

    void padrao () {
        vida = 100;
        nome = "Claudio";
        tipo = "corredor";
        forca = 900;
    }

    void andar() {
        System.out.println(nome + " Teste.Zumbi andando");
    }
    void matar(){
        System.out.println("Teste.Zumbi matando");
    }
    void alimentacao () {
        System.out.println("Teste.Zumbi comendo");
    }
}
