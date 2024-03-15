package Exercicio_0_Cantina;

public class Cantina {
    Salgado[] salgados;
    String nome;


    void mostraSalgados(){
        for(int i = 0; i < salgados.length; i++){
            System.out.println(salgados[i].nome);
        }
    }
    void addSalgados(Salgado novoSalgado){

        for (int i = 0; i < salgados.length; i++) {
            if(salgados[i] == null)
                salgados[i] = novoSalgado;
        }
    }
}
