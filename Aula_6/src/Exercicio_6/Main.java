package Exercicio_6;

public class Main {
    public static void main(String[] args) {

        Kart carroFlor = new Kart();
        Kart carroCogumelo = new Kart();
        Piloto Mario = new Piloto();
        Piloto Bowser = new Piloto();
        
        carroFlor.nome = "carro Flor";
        carroFlor.piloto = Mario;
        carroFlor.piloto.vilao = false;
        carroFlor.motor.cilindradas = "50";
        carroFlor.pular();
        carroCogumelo.fazerDrift();
        carroCogumelo.soltarTurbo();

        carroCogumelo.piloto = Bowser;
        carroCogumelo.piloto.vilao = true;
        carroCogumelo.nome = "carro Cogumelo";
        carroCogumelo.motor.cilindradas = "100";
        carroCogumelo.pular();
        carroCogumelo.fazerDrift();
        carroCogumelo.soltarTurbo();
    }
}
