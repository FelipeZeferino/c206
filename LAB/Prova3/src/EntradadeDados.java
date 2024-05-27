import java.io.*;

public class EntradadeDados {
    InputStream fluxoEntrada = null;
    InputStreamReader leitorFluxoEntrada = null;
    BufferedReader bufferEntrada = null;
    String linha = null;

    try
    {
        try {
            fluxoEntrada = new FileInputStream("felipemendessilvazeferino/Desktop/log.txt");
        } catch (FileNotFoundException exc) {
            throw new RuntimeException(exc);
        }
        leitorFluxoEntrada = new InputStreamReader(fluxoEntrada);
        bufferEntrada = new BufferedReader(leitorFluxoEntrada);
        while(linha != null)
        {
            System.out.println(linha);
            try {
                linha = bufferEntrada.readLine();
            } catch (IOException exc) {
                throw new RuntimeException(exc);
            }
        }
    }catch (FileNotFoundException ex)
    {
        System.out.println("File not found Exception: " + ex);
    }
    catch(IOException e){
        System.out.println("IO exception: " + e);
    }
    finally{
        try{
            bufferEntrada.close();
        } catch(IOException e){
            System.out.println("Erro de IO: " + e);
        }
    }
}
