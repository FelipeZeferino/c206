import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Arquivo{

    OutputStream fluxoSaida = null;
    OutputStreamWriter geradorFluxoSaida = null;
    BufferedWriter bufferSaida = null;
    String linha = null;

    public void escrever(Jogo jogo){
        if(jogo.getPreco() < 0){
            throw new PrecoNegativoException("");
        }
        //permite escrever o jogo no arquivo txt
    }

    public ArrayList<Jogo> ler(){
        //TODO precisa retornar arraylist em txt

    }
}
