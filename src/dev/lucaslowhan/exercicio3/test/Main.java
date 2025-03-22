package dev.lucaslowhan.exercicio3.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        System.out.println("Lista original: " + numeros);
        numeros.removeIf(n -> n % 2 == 0);
        System.out.println("Lista após remover pares:" + numeros);
    }
}
