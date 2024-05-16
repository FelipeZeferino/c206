public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }



    public void postarFoto(){
        System.out.println("Postou foto no Facebook!");
    }
    public void postarVideo(){
        System.out.println("Postou video no Facebook!");
    }
    public void postarComentario(){
        System.out.println("Postou Comentário no Facebook!");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu Post no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no Facebook!");
    }
    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Facebook!");
    }

}
