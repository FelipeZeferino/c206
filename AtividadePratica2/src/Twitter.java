public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public void postarFoto(){
        System.out.println("Postou foto no Twitter!");
    }
    public void postarVideo(){
        System.out.println("Postou video no Twitter!");
    }
    public void postarComentario(){
        System.out.println("Postou Comentário no Twitter!");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu Post no Twitter!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Twitter!");
    }
}
