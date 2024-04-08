public class Hatch extends Carro{
    int portas;

    public Hatch(int portas, double valor, String cor, int ano) {
        this.portas = portas;
        setValor(valor);
        setCor(cor);
        setAno(ano);
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Portas: " + portas);
    }
    public void taxa(){
        System.out.println("Taxa: 2000");
    }
}
