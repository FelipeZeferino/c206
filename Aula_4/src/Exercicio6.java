import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //exercicio 6 - slide

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int num;
        int numGerado = rand.nextInt(1,10);
        do {
            System.out.println("Entre com seu chute:");
            num = entrada.nextInt();

            if(num < numGerado)
                System.out.println("Mais!");

            if(num > numGerado)
                System.out.println("Menos!");

        }while(num != numGerado);

        System.out.println("Parabéns!");
    }
}
