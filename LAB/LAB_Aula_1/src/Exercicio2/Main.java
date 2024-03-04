package Exercicio2;

public class Main {
    public static void main(String[] args) {
        //Exercicio 1 na main

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Palio";
        carro1.cor = "Branco";
        carro1.marca = "Fiat";
        carro1.velocidadeAtual = 0;
        carro1.velocidadeMax = 180;
        carro1.motor.potencia = 330;
        carro1.motor.tipo = "Fire";

        carro2.modelo = "BMW X1";
        carro2.cor = "Prata";
        carro2.marca = "BMW";
        carro2.velocidadeAtual = 0;
        carro2.velocidadeMax = 330;
        carro2.motor.potencia = 600;
        carro2.motor.tipo = "BMW Premium";

        carro1.mostraInfo();
        carro1.ligar();
        carro1.acelerar();
        carro1.mostraInfo();


        carro2.mostraInfo();
        carro2.ligar();
        carro2.acelerar();
        carro2.mostraInfo();
    }

}
