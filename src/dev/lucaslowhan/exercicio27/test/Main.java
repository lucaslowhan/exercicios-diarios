package dev.lucaslowhan.exercicio27.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> alunosNotas = new HashMap<>();
        int contador = 0;
        String nome;
        Double nota;
        while (contador<5){
            System.out.println("Digite o nome do aluno: ");
            nome = sc.next();
            System.out.println("Digite a nota do aluno " + nome + ": ");
            nota = sc.nextDouble();
            alunosNotas.put(nome,nota);
            contador++;
        }
        for(Map.Entry<String,Double> entry: alunosNotas.entrySet()){
            System.out.println("Aluno: " + entry.getKey() + " | " + "Nota: " + entry.getValue());
        }
        System.out.println("Digite o nome a ser consultado: ");
        String nomeConsultado = sc.next();
        System.out.println(alunosNotas.get(nomeConsultado));

    }
}
