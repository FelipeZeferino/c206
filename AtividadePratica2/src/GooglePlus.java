public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public void postarFoto(){
        System.out.println("Postou foto no Google Plus!");
    }
    public void postarVideo(){
        System.out.println("Postou video no Google Plus!");
    }
    public void postarComentario(){
        System.out.println("Postou Comentário no Google Plus!");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu Post no Google Plus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no Google Plus!");
    }
    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Google Plus!");
    }


}
