package dev.lucaslowhan.exercicio32.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Double> alunosNotas = new TreeMap<>();
        String nome;
        Double nota;
        int contador = 0;
        while (contador<4) {
            System.out.println("Adicionar aluno: ");
            nome = sc.next();
            nota = sc.nextDouble();
            alunosNotas.put(nome,nota);
            contador++;
        }
        System.out.println("\nAlunos ordenados:");
        for (Map.Entry<String, Double> entrada : alunosNotas.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        Map.Entry<String, Double> menorNota = alunosNotas.firstEntry();
        Map.Entry<String, Double> maiorNota = alunosNotas.lastEntry();

        System.out.println("\nMaior nota: "+ maiorNota.getKey() + "-" + maiorNota.getValue());
        System.out.println("\nMenor nota: "+ menorNota.getKey() + "-" + menorNota.getValue());

    }
}
