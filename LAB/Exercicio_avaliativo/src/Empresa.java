import java.util.Scanner;

public class Empresa {
    String nome;
    String cnpj;
    String endereco;
    int funcionariosDisponiveis;
    Funcionario[] funcionarios = new Funcionario[5];

    void mostrainfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("cnpj: " + this.cnpj);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Funcionários disponíveis: " + this.funcionariosDisponiveis);
    }
    void adicionarFuncionario(Pessoa pessoa){
        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] == null)
            {
                funcionarios[i] = new Funcionario(pessoa);
                funcionarios[i].matricula = i;
                break;
            }
        }
    }
    void alocarFuncionario(int index){
        System.out.println("Funcionário alocado!");
        this.funcionariosDisponiveis--;
    }
    float contarFuncionariosDisponiveis(){
        System.out.println("Funcionários disponiveis: " + funcionariosDisponiveis);

        return funcionariosDisponiveis;
    }


}
