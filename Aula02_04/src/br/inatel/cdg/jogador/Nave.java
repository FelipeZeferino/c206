package br.inatel.cdg.jogador;
import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;


    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }
    public int getTipoTiro(){
        if(this.tipoTiro.equals("Normal"))
            return 1;
        else if (this.tipoTiro.equals("Explosivo"))
            return 2;
        return 0;
    }

    public void atirar(Asteroide asteroide){
        if(this.tipoTiro == "Explosivo"){
                asteroide.destruir();
        }else if(this.tipoTiro.equals("Normal") && asteroide.getTipoAsteroide() == 1){
            asteroide.destruir();
        }
    }
}
