package dev.lucaslowhan.exercicio25.test;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NavigableSet<String> nomes = new TreeSet<>();
        int contador = 0;
        System.out.println("Digite 10 palavras:");
        while(contador<10){
            nomes.add(sc.nextLine());
            contador++;
        }
        System.out.println("Ordem crescente: "+nomes);
        System.out.println("Ordem decrescente: "+nomes.descendingSet());

    }
}
