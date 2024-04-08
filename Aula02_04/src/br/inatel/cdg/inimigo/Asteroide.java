package br.inatel.cdg.inimigo;

import java.util.Objects;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;


    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }
    public void destruir(){
        System.out.println("Cometa destruído!");
    }
    public int getTipoAsteroide(){
        if(this.tipoAsteroide != null){
        if(this.tipoAsteroide == "Pequeno")
            return 1;
        else return 2;
        }
        return 0;
    }
}
