package dev.lucaslowhan.exercicio16.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        while (numeros.size()<5){
            System.out.println("Digite um número:");
            numeros.add(sc.nextInt());
        }
        System.out.println("Números inseridos:" + numeros);
        System.out.println("Qual número deseja verificar?");
        int numeroVer = sc.nextInt();
        Iterator<Integer> numerosIterator = numeros.iterator();
        while (numerosIterator.hasNext()){
            if(numerosIterator.next().equals(numeroVer)){
                System.out.println("Numero " + numeroVer + " removido.");
                numerosIterator.remove();
            }
        }
        System.out.println(numeros);
    }
}
