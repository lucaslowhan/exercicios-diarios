package dev.lucaslowhan.exercicio34.test;

import java.util.*;
/*Exercício 2: Sistema de Classificação de Alunos
Crie um TreeMap<String, Double> para armazenar nomes de alunos e suas notas.

✔ Peça ao usuário para cadastrar alunos e suas notas.
✔ Exiba a ordem alfabética dos alunos.
✔ Mostre o aluno com a maior nota e o aluno com a menor nota.

✍ Bônus: Permita ao usuário buscar a nota de um aluno específico pelo nome.

*/

public class Main {
    public static void main(String[] args) {
        TreeMap<String,Double> sistemaClassAlunos = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos deseja cadastrar?");
        int contador = sc.nextInt();
        for (int i = 0; i < contador; i++) {
            System.out.println("Qual nome do aluno?");
            String nome = sc.next();
            System.out.println("Qual nota do aluno?");
            double nota = sc.nextDouble();
            sistemaClassAlunos.put(nome,nota);
        }
        for(Map.Entry<String,Double>entrada : sistemaClassAlunos.entrySet()){
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
        Map.Entry<String, Double> menorNota = sistemaClassAlunos.firstEntry();
        Map.Entry<String, Double> maiorNota = sistemaClassAlunos.lastEntry();


        System.out.println("Aluno com maior nota: "+ maiorNota.getKey() + " - " + maiorNota.getValue());
        System.out.println("Aluno com menor nota: "+ menorNota.getKey() + " - " + menorNota.getValue());
        System.out.println("Qual aluno deseja verificar a nota ? ");
        String nomeProcurado = sc.next();
        System.out.println(sistemaClassAlunos.get(nomeProcurado));

    }
}
