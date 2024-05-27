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

        for (int i = 0; i < user.redesSociais.length; i++) {
            if(user.redesSociais[i] instanceof Facebook){
                user.redesSociais[i].postarFoto();
                user.redesSociais[i].postarVideo();
                user.redesSociais[i].postarComentario();
                user.redesSociais[i].curtirPublicacao();
                ((Facebook) user.redesSociais[i]).fazStreaming();
            }
            if (user.redesSociais[i] instanceof Instagram){
                user.redesSociais[i].postarFoto();
                user.redesSociais[i].postarVideo();
                user.redesSociais[i].postarComentario();
                user.redesSociais[i].curtirPublicacao();
            }
            if (user.redesSociais[i] instanceof Twitter){
                user.redesSociais[i].postarFoto();
                user.redesSociais[i].postarVideo();
                user.redesSociais[i].postarComentario();
                user.redesSociais[i].curtirPublicacao();
                ((Twitter) user.redesSociais[i]).compartilhar();
            }
            if (user.redesSociais[i] instanceof GooglePlus){
                user.redesSociais[i].postarFoto();
                user.redesSociais[i].postarVideo();
                user.redesSociais[i].postarComentario();
                user.redesSociais[i].curtirPublicacao();
                ((GooglePlus) user.redesSociais[i]).fazStreaming();
                ((GooglePlus) user.redesSociais[i]).compartilhar();
            }
        }
    }
}