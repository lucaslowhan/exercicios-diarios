package dev.lucaslowhan.exercicio20.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        System.out.println(numeros);
        System.out.println("Digite um número para verificar:");
        int numero = sc.nextInt();
        if(numeros.contains(numero)){
            System.out.println("O número " + numero + " está no conjunto.");
        }else{
            System.out.println("O número " + numero + " NÃO está no conjunto.");
        }
    }
}
