package br.inatel.cdg;

import br.inatel.cdg.jogador.Nave;
import br.inatel.cdg.inimigo.Asteroide;

public class Main {
    public static void main(String[] args) {
        Nave nave1 = new Nave("Felipe",100,"Explosivo");
        Asteroide asteroide = new Asteroide("Inimigo","Grande");
        nave1.atirar(asteroide);
    }

}
