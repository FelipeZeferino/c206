public class Funcionario {

    int matricula;
    Pessoa pessoa = new Pessoa();
    Funcionario(Pessoa pessoa) {
    pessoa = new Pessoa();
    }

    void mostraInfo(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("cpf: " + pessoa.cpf);
        System.out.println("idade: " + pessoa.idade);
    }
}
