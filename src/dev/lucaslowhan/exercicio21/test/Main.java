package dev.lucaslowhan.exercicio21.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Double> numeros = new HashSet<>();
        numeros.add(3.5);
        numeros.add(1.2);
        numeros.add(7.8);
        numeros.add(4.6);
        numeros.add(2.1);
        Set<Double> numerosTree = new TreeSet<>(numeros);

        System.out.println("Valores no HashSet (ordem aleatória): " + numeros);
        System.out.println("Valores ordenados no TreeSet: "+ numerosTree);
    }
}
