package dev.lucaslowhan.exercicio22.test;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> numeros = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador<10){
            System.out.println("Digite um numero:");
            numeros.add(sc.nextInt());
            contador++;
        }
        System.out.println("Digite um numero para verificação:");
        int numero = sc.nextInt();
        System.out.println("O maior numero, menor que o verificado é:"+numeros.lower(numero));
        System.out.println("O menor numero, maior que o verificado é:"+numeros.higher(numero));
        System.out.println("----- ORDEM DECRESCENTE -----");
        for(int num : numeros.descendingSet()){
            System.out.println(num);
        }

    }
}
