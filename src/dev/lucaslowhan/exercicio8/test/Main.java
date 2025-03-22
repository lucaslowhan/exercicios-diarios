package dev.lucaslowhan.exercicio8.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Maria", "Jose","Lucas","Kamily", "Kauã"));
        System.out.println("Lista original: "+ nomes);
        Collections.sort(nomes);
        System.out.println("Lista ordenada crescente: " + nomes);
        nomes.sort(Comparator.reverseOrder());
        System.out.println("Lista ordenada decrescente:" + nomes);
    }
}
