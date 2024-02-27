import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //while e do while

        /*
        while (true) {

        }

        -------------------

        do {

        }while(true)

        -------------------

        for(i = 0; i < q; i++){

        }

        for (){

        if(i ==5)
        continue; -> Força o loop para o fim. a condição será testada novamente.

        }


        */

        //Exercicio 5 - slide

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int num;
        int numGerado = rand.nextInt(1,10);
        do {
            System.out.println("Entre com seu chute:");
            num = entrada.nextInt();

        }while(num != numGerado);

        System.out.println("Parabéns!");



    }
}