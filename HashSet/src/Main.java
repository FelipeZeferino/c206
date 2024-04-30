import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> arrayList = new ArrayList<>();
        HashSet <Integer> hashSet = new HashSet<>();
        HashMap <Integer,Integer> hashMap = new HashMap<>();
        long tempoInicial, tempoFinal;
        int quantElementos = 100000;

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < quantElementos; i++) {
            arrayList.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para preencher arrayList: " + (tempoFinal-tempoInicial) + "ms");

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < quantElementos; i++) {
            arrayList.contains(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para procurar no arrayList: " + (tempoFinal-tempoInicial) + "ms");


        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < quantElementos; i++) {
            hashSet.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para adicionar no hashSet: " + (tempoFinal-tempoInicial) + "ms");

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < quantElementos; i++) {
            hashSet.contains(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para procurar no hashSet: " + (tempoFinal-tempoInicial) + "ms");

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < quantElementos; i++) {
            hashMap.put(i,i+1);
            hashMap.containsKey(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo final para preencher hashMap: " + (tempoFinal-tempoInicial) + "ms");

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < quantElementos; i++) {
            hashMap.containsKey(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo final para procurar no hashMap: " + (tempoFinal-tempoInicial) + "ms");

    }
}