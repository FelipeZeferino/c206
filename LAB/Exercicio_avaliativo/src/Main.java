import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha;
        Empresa empresa = new Empresa();
        Scanner entrada = new Scanner(System.in);
        Scanner dados = new Scanner(System.in);
        System.out.println("Entre com o nome da empresa: ");
        empresa.nome = entrada.nextLine();
        System.out.println("Entre com o cnpj da empresa: ");
        empresa.cnpj = entrada.nextLine();
        System.out.println("Entre com o endereço da empresa: ");
        empresa.endereco = entrada.nextLine();
        empresa.funcionariosDisponiveis = 0;
        do {
            System.out.println("Menu:");
            System.out.println("Digite 1 para mostrar informações da empresa");
            System.out.println("Digite 2 para adicionar novo funcionário");
            System.out.println("Digite 3 para alocar funcionário");
            System.out.println("Digite 4 para mostrar funcionários disponíveis");
            System.out.println("Digite 5 para mostrar info de um funcionário");
            System.out.println("Digite 6 para sair");
            escolha = entrada.nextInt();
            switch(escolha)
            {
                case 1:
                    empresa.mostrainfo();
                    break;
                case 2:
                    Pessoa novofuncionario = new Pessoa();
                    System.out.println("Nome: ");
                    novofuncionario.nome = dados.nextLine();
                    System.out.println("idade:");
                    novofuncionario.idade = dados.nextInt();
                    System.out.println("cpf: ");
                    novofuncionario.cpf = dados.nextLine();
                    empresa.adicionarFuncionario(novofuncionario);
                    empresa.funcionariosDisponiveis++;
                    break;
                case 3:
                    empresa.alocarFuncionario(1);
                    break;
                case 4:
                    empresa.contarFuncionariosDisponiveis();
                    break;
                case 5:
                    System.out.println("Entre com a matricula do funcionário que deseja ver, de 0 a "+ empresa.funcionarios.length);
                    int matEscolhida = dados.nextInt();
                    if(matEscolhida >= 0 && matEscolhida < empresa.funcionarios.length)
                    {
                        empresa.funcionarios[matEscolhida].mostraInfo();
                    }
                case 6: break;
                default:
                    System.out.println("Escolha outro número válido!");
                    break;
            }
        } while (escolha != 6);


    }
}