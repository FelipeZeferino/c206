import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //casting e promoções
        /*double numero = 3.14
         int numero2 = (int) numero;  casted

         promoção
         int x = 10;
         long x1 = x; promovido
         *Entrada de dados*
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
         */
       // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a quantidade de lanches comidos na primeira hora:");
        int lanche1 = entrada.nextInt();
        System.out.println("Entre com a quantidade de lanches comidos na segunda hora:");
        int lanche2 = entrada.nextInt();
        System.out.println("Entre com a quantidade de lanches comidos na terceira hora:");
        int lanche3 = entrada.nextInt();

        //processamento
        int total = lanche1 + lanche2 + lanche3;
        float media = total/3.0f;

        //saida
        System.out.println("total de lanches:" + total);
        System.out.println("media de lanches:" + (int)media);

        entrada.close();

    }
}