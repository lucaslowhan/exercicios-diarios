package dev.lucaslowhan.exercicio23.test;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<String>nomes = new TreeSet<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Daniel");
        nomes.add("Eduardo");
        nomes.add("Fernanda");
        nomes.add("Gabriel");
        nomes.add("Helena");
        nomes.add("Igor");
        nomes.add("Julia");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nomes inseridos: " + nomes);
        System.out.println("Digite um nome inicial: ");
        String nomeInicial = sc.nextLine();
        System.out.println("Digite um nome final: ");
        String nomeFinal = sc.nextLine();
        NavigableSet<String> subSet = nomes.subSet(nomeInicial, true, nomeFinal, false);
        System.out.println("Subconjunto de nomes: "+ subSet);

    }
}
