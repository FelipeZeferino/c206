public class Instagram extends RedeSocial{

    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
    public void postarFoto(){
        System.out.println("Postou foto no Instagram!");
    }
    public void postarVideo(){
        System.out.println("Postou video no Instagram!");
    }
    public void postarComentario(){
        System.out.println("Postou Comentário no Instagram!");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu Post no Instagram!");
    }
}
