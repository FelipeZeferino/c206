package Exercicio2;

public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor = new Motor();

    void ligar(){
        System.out.println("Carro ligado");
    }
    void acelerar() {
        System.out.println("Carro Acelerando");
        if(this.velocidadeAtual == this.velocidadeMax){
            System.out.println("Velocidade máxima atingida");
        }else this.velocidadeAtual += 10;
    }
    void mostraInfo(){
        System.out.println(this.cor);
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.velocidadeMax);
        System.out.println(this.velocidadeAtual);
    }
}
