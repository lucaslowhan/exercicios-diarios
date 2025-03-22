package dev.lucaslowhan.exercicio17.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        int contador = 0;
        while (contador<10){
            System.out.println("Digite um número: ");
            numeros.add(sc.nextInt());
            contador++;
        }
        System.out.println("Números únicos inseridos: " + numeros);

    }
}
