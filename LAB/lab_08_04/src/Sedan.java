public class Sedan extends Carro{
    int portaMalas;

    public Sedan(int portaMalas, double valor, String cor, int ano) {
        this.portaMalas = portaMalas;
        setValor(valor);
        setCor(cor);
        setAno(ano);
    }


    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Porta Malas: " + portaMalas);
    }
    public void taxa(){
        System.out.println("Taxa: 5000");
    }
}
