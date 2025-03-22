package dev.lucaslowhan.exercicio1.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("Julia");
        nomes.add("Carlos");
        nomes.add("Bianca");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome para adicionar à lista:");
        nomes.add(sc.nextLine());
        String lista = "Lista final: [";
        for(String nome: nomes){
            lista += nome + ",";
        }
        lista += "]";
        System.out.println(lista);
    }
}
