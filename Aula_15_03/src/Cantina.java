public class Cantina {
    //resolução feita pelo Professor durante a aula
    String nome = "Cantina do Inatel";
    Salgado [] salgados = new Salgado[3];

    void addSalgado(Salgado novoSalgado){
        for(int i =0; i < salgados.length; i++){
            if(salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        for (int i = 0; i < salgados.length; i++) {
            System.out.println(salgados[i].nome);
        }

    }
}
