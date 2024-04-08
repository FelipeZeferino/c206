public class Main {
    public static void main(String[] args) {
        Carro Civic = new Sedan(320,50000,"Preto",2022);
        Carro Fit = new Hatch(4,45000,"Branco",2018);
        Carro Renegade = new SUV("Traseira", 70000,"Prata",2024);

        Civic.mostrarInfo();
        Civic.taxa();

        Fit.mostrarInfo();
        Fit.taxa();

        Renegade.mostrarInfo();
        Renegade.taxa();
    }
}