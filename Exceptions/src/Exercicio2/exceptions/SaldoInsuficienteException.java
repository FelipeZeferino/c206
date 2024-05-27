package Exercicio2.exceptions;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(String message){
        super(message);
    }
}
