public class SUV extends Carro{
    String tracao;

    public SUV(String tracao, double valor, String cor, int ano) {
        this.tracao = tracao;
        setValor(valor);
        setCor(cor);
        setAno(ano);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tração: " + tracao);
    }
    public void taxa(){
        System.out.println("Taxa: 3000");
    }


}
