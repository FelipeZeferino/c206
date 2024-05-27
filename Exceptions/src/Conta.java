import java.util.HashSet;

public class Conta {
    private double saldo;
    private double limite;
    HashSet<Cliente> clientes = new HashSet<>();

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public boolean sacar(double quantia){
        this.saldo -= quantia;
        return true;
    }
    public void mostraInfo(){
        for (Cliente client : clientes) {
            try{
            System.out.println(client.getNome());
            System.out.println(client.getCpf());
            } catch (NullPointerException e ){
                System.out.println("Erro: " + e);
            }
        }
        }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}

