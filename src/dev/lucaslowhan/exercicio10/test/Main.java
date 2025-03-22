package dev.lucaslowhan.exercicio10.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (nomes.size()<5){
            System.out.println("Digite um nome:");
            nomes.add(sc.nextLine());
        }
        Iterator<String> nomesIterator = nomes.iterator();
        while(nomesIterator.hasNext()){
            String nome = nomesIterator.next();
            System.out.println(nome);
        }
        System.out.println("Qual nome deseja remover?");
        String nomePesquisado = sc.nextLine();
        nomes.remove(nomePesquisado);
        System.out.println(nomes);
    }
}
