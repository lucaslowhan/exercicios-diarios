package dev.lucaslowhan.exercicio13.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>(
                List.of(3, 7, 3, 1, 7, 9, 3, 5));
        System.out.println("Lista de números: "+numeros);
        System.out.println("Digite um número para contar:");
        int numero = sc.nextInt();
        int count=0;
        Iterator<Integer> numerosIterator = numeros.iterator();
        while(numerosIterator.hasNext()){
            if(numerosIterator.next().equals(numero)){
                count++;
            }
        }
        System.out.println("O número "+numero+" aparece "+count+" vezes na lista.");
    }
}
