import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int npa = teclado.nextInt();


        if(npa >= 60){
            System.out.println("Aprovado!");
        } else if(npa < 30){
            System.out.println("reprovado");

        } else {
            System.out.println("Coloque a nota da np3");
            int np3 = teclado.nextInt();
            if((np3 + npa)/2 >= 50){
                System.out.println("Aprovado");
            } else
                System.out.println("Reprovado na np3");

        }
        teclado.close();
    }

}
