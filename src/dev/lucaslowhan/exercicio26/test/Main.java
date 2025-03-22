package dev.lucaslowhan.exercicio26.test;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NavigableSet<Double> notas = new TreeSet<>();
        int contador = 0;
        while (contador<5){
            notas.add(sc.nextDouble());
            contador++;
        }
        System.out.println("Menor nota: " + notas.first());
        System.out.println("Maior nota: " + notas.last());
        System.out.println("Notas acima de 7: "+ notas.tailSet(7.0,false));
    }
}
