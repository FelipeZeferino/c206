import java.util.HashSet;

public class Usuario {

    private String nome;
    private String email;
    //public RedeSocial [] redesSociais;
    public HashSet<RedeSocial> redes;

    public Usuario(RedeSocial[] redesSociais){
        //this.redesSociais = redesSociais;
        this.redes = new HashSet<RedeSocial>();
        for (RedeSocial redeSocial : redesSociais) {
            this.redes.add(redeSocial);
        }
    }

}
