public abstract class Carro implements Controle {
    private double valor;
    private String cor;
    private int ano;


    public abstract void taxa();

    public void mostrarInfo(){
        System.out.println("Valor: " + valor);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }



    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
