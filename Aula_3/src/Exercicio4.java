import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numAlunos = teclado.nextInt();

        switch (numAlunos){

            case 10:
                System.out.println("Sala I-16");
                break;
            case 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Nenhuma sala suporta essa quantidade.");
        }

teclado.close();
    }
}
