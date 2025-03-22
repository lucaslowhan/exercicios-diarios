package dev.lucaslowhan.exercicio5.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>(List.of("Maçã", "Banana", "Uva", "Laranja", "Manga", "Melancia"));
        System.out.println("Lista original: "+frutas);
        System.out.println("Sublista (1 a 4): " +frutas.subList(1,5));
        frutas.set(2,"Pera");
        System.out.println("Lista após atualização: "+frutas);

    }
}
