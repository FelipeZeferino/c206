package Exercicio.exerc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filha1 classe1 = new Filha1("Filha1", 1);
        Filha2 classe2 = new Filha2("Filha2", 2);
        Filha3 classe3 = new Filha3("Filha3", 3);

        List <Abstrata> lista = new ArrayList<>();
        lista.add(classe1);
        lista.add(classe2);
        lista.add(classe3);

        Collections.sort(lista); //ordena de acordo com o compareTo da classe
        //Collections.sort(lista, reverseOrder()); Altera a ordem do retorno, crescente -> descrescente

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getCodigo());
        }


    }
}
