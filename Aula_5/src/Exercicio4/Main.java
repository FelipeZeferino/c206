package Exercicio4;

public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 50;
        zumbi2.vida = 50;

        zumbi1.transfereVida(zumbi2, 30);
        System.out.println(zumbi1.vida);
        System.out.println(zumbi2.vida);
    }
}
