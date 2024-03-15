package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Empresa fiat = new Empresa();
        fiat.contatos[0] = new Contato();
        fiat.contatos[0].nome = "Claudio";
        fiat.contatos[0].dataNascimento = "13101998";
        fiat.contatos[0].email = "claudioSamsung@samsung.com";
        fiat.contatos[0].telefone = "359999-8899";
        fiat.contatos[1] = new Contato();
        fiat.contatos[1].nome = "Felipe";
        fiat.contatos[1].dataNascimento = "11082000";
        fiat.contatos[1].email = "Felipe@Midea.com";
        fiat.contatos[1].telefone = "359999-7777";
    }

}
