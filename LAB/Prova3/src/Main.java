import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arquivo arquivo =  new Arquivo();
        ArrayList<Jogo> jogos = new ArrayList<>();

        int escolha;
        do {
            escolha = sc.nextInt();
            sc.nextLine();
            System.out.println("--Menu--");
            System.out.println("Digite 1 para salvar as informações do jogo em um arquivo.");
            System.out.println("Digite 2 para mostrar as informações do jogos salvos.");
            System.out.println("Digite 3 para ordenar os jogos em ordem crescente de preço.");
            System.out.println("Digite 4 para ordenar os jogos em ordem decrescente de preço.");
            System.out.println("Digite 0 para sair.");

            switch(escolha){
                case 1: //salvar infos
                {
                    Jogo jogo = new Jogo();
                    System.out.println("Entre com o nome do jogo:");
                    jogo.setNome(sc.nextLine());
                    System.out.println("Entre com o preço do jogo:");
                    jogo.setPreco(sc.nextDouble());
                    System.out.println("Entre com o genero do jogo:");
                    jogo.setGenero(sc.nextLine());
                    try {
                        arquivo.escrever(jogo);
                        jogos.add(jogo);
                    } catch (PrecoNegativoException e) {
                        System.out.println("o preço não pode ser negativo!");
                        break;
                    }
                }
                case 2: //Mostrar info
                {

                }
                case 3:
                {
                    jogos.sort(Jogo::compareTo);
                }
                case 4:
                {
                  jogos.sort(Jogo::compareTo);
                  jogos.reversed();
                }


            }
        } while (escolha != 0);



    }
}