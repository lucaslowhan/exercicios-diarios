package dev.lucaslowhan.exercicio24.test;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> numeros = new TreeSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        numeros.add(30);
        numeros.add(35);
        numeros.add(40);
        numeros.add(45);
        numeros.add(50);
        System.out.println("Números inseridos: "+numeros);
        System.out.println("Menor elemento removido: "+numeros.pollFirst());
        System.out.println("Maior elemento removido: "+numeros.pollLast());
        System.out.println("Conjunto atualizado: "+ numeros);
    }
}
