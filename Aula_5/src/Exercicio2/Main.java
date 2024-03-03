package Exercicio2;

public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi2.vida = 80;
        zumbi1.vida = 70;
        zumbi1 = zumbi2;
        System.out.println(zumbi1.vida);
        zumbi2.vida = 100;
        System.out.println(zumbi1.vida);
        zumbi1.vida = 50;
        System.out.println(zumbi2.vida);

    }
}
