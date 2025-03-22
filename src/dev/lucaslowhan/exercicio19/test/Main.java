package dev.lucaslowhan.exercicio19.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        String[] frases = frase.split(" ");
        Set<String> fraseSeparada = new HashSet<>(Arrays.asList(frases));
        System.out.println("Palavras únicas: "+fraseSeparada);
        System.out.println("Quantidade de palavras únicas: " + fraseSeparada.size());
    }
}
