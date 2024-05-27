import java.io.*;

public class SaidadeDados {
    OutputStream fluxoSaida = null;
    OutputStreamWriter geradorFluxoSaida = null;
    BufferedWriter bufferSaida = null;
    String linha = null;

    try{
        fluxoSaida = new FileOutputStream("felipemendessilvaZeferino/Desktop/log.txt", true);
        geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
        bufferSaida = new BufferedWriter(geradorFluxoSaida);
        linha = "Texto aqui";
        bufferSaida.write(linha);
        bufferSaida.newLine();
    }catch (
    FileNotFoundException ex)
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
