public class Main {
    public static void main(String[] args) {


        RedeSocial [] Redes = new RedeSocial[4];
        RedeSocial facebook = new Facebook("123", 100);
        RedeSocial twitter = new Twitter("1234", 10);
        RedeSocial googlePlus = new GooglePlus("12", 15);
        RedeSocial instagram = new Instagram("102", 250);

        Redes[0] = facebook;
        Redes[1] = twitter;
        Redes[2] = googlePlus;
        Redes[3] = instagram;

        Usuario user = new Usuario(Redes);

        for (RedeSocial rede : user.redes) {
            rede.postarFoto();
            rede.postarVideo();
            rede.postarComentario();
            rede.curtirPublicacao();

            if (rede instanceof Facebook) {
                ((Facebook) rede).fazStreaming();
            } else if (rede instanceof Twitter) {
                ((Twitter) rede).compartilhar();
            } else if (rede instanceof GooglePlus) {
                ((GooglePlus) rede).fazStreaming();
                ((GooglePlus) rede).compartilhar();
            }
        }
    }
}