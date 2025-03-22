package dev.lucaslowhan.exercicio2.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(9);
        numeros.add(4);
        numeros.add(12);
        numeros.add(1);
        numeros.add(7);
        numeros.add(5);
        numeros.add(3);
        numeros.add(10);
        numeros.add(2);
        numeros.add(8);
        System.out.println("Lista antes da ordenação:"+numeros);
        numeros.sort(null);
        System.out.println("Lista apos ordenação: "+numeros);


    }
}
