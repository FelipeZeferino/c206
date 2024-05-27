package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1000,1000000);
        Cliente cliente1 = new Cliente("Jonas", 13131);
        Cliente cliente2 = new Cliente("Chris", 9991);

        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(null);
        conta.mostraInfo();
    }
}