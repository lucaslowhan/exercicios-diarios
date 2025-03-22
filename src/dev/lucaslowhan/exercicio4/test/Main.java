package dev.lucaslowhan.exercicio4.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("Java","Python","JavaScript","Java","React"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra para contar: ");
        String palavra = sc.nextLine();
        if(palavras.lastIndexOf(palavra)>0) {
            System.out.println("A palavra " + palavra + " apareceu " + palavras.lastIndexOf(palavra) + " vezes");
        }else {
            System.out.println("A palavra " + palavra + " não tem na lista");
        }
    }
}
