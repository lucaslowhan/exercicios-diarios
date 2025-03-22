package dev.lucaslowhan.exercicio7.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(7, 2, 9, 4, 6, 1, 5, 8, 3, 10));
        System.out.println("Lista original: " + numeros);
        Collections.sort(numeros);
        System.out.println("Lista ordenada zcrescente: " + numeros);
        numeros.sort(Comparator.reverseOrder());
        System.out.println("Lista ordenada decrescente: "+numeros);
    }
}
