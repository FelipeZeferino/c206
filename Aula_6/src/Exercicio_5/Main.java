package Exercicio_5;

import Exercicio_5.Personagem;

public class Main {
    public static void main(String[] args) {
/*
Relacionamento entre objetos -> Associação

Um objeto pode conter outro OU tomar ação sobre outro
Agregação x composição

agreg. ex.:
MAIN
Conta conta = new Conta();
Cliente cliente = new Cliente();

conta.titular = cliente;
.
composição ex.:
public class Cliente(){
String nome
int idade
Conta conta = new Conta(); -> Não pode ter-se cliente sem connta
}
Constructor
1. sempre mesmo nome da classe
*/

        Personagem personagem1 = new Personagem();
        Arma espada = new Arma();
        espada.resistencia = 100;
        espada.poder = 5;
        espada.resistencia = 75;

        personagem1.nome = "Guerreiro";
        personagem1.arma = espada; //agregaçaõ
        personagem1.pontos = 0;


    }
}