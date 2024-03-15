public class Main {
    public static void main(String[] args) {
        //resolução Chris
        Cantina inatel = new Cantina();

        Salgado coxinha = new Salgado();
        coxinha.nome = "Coxinha";

        Salgado empada = new Salgado();
        empada.nome = "Empada";

        Salgado esfirra = new Salgado();
        esfirra.nome = "Esfirra";


        inatel.addSalgado(esfirra);
        inatel.addSalgado(coxinha);
        inatel.addSalgado(empada);
        inatel.mostraInfo();
    }


}