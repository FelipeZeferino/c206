public class PrecoNegativoException extends RuntimeException{
    PrecoNegativoException(String message){
        System.out.println("Preço negativo! " + message);
    }
}
