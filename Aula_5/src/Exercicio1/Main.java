package Exercicio1;

public class Main {
    public static void main(String[] args) {

        /*
        conta c1 = new Conta();
        conta c2 = new Conta();


        if (c1 == c2) -> retorna false
        c1 = c2 -> os dois ponteiros apontam para o mesmo endereço de memória, então caso rode o seguinte código
        if (c1 = c2) -> retornará true

        c2.nome = "Ana"
        sout(c1.nome) -> Retorna "Ana"

       void transferir (){

       }

         */

   //Conta c = new Conta()
        Zumbi zumbi = new Zumbi();
        zumbi.forca = 100;
        zumbi.nome = "Felipe";
        zumbi.tipo = "corredor";
        zumbi.vida = 100;

        System.out.println(zumbi.nome);
        zumbi.alimentacao();
        zumbi.andar();
        zumbi.matar();


    }
}