package Exercicio_0_Cantina;

public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        cantina.salgados = new Salgado[3]; // referências
        for (int i = 0; i < 3; i++) {
            cantina.salgados[i] = new Salgado(); // criando os objetos
        }
        cantina.nome = "Cantina do Inatel";
        Salgado Coxinha = new Salgado();
        Salgado Torta = new Salgado();
        Salgado Esfirra = new Salgado();
        cantina.addSalgados(Coxinha);
        cantina.addSalgados(Torta);
        cantina.addSalgados(Esfirra);
    }



}
