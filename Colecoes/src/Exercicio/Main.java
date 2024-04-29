package Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Double> listaDouble = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listaDouble.add(Math.random());
        }
        Collections.sort(listaDouble, Collections.reverseOrder());
        for (int i = 0; i < 5; i++) {
            System.out.println(listaDouble.get(i));
        }


    }
}
