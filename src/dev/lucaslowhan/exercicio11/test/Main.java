package dev.lucaslowhan.exercicio11.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (numeros.size()<5){
            System.out.println("Digite um número: ");
            numeros.add(sc.nextInt());
        }
        Iterator<Integer> integerIterator = numeros.iterator();

        System.out.println("Números digitados:");
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
