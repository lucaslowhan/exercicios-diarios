package dev.lucaslowhan.exercicio28.test;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> produtosPrecos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Adicionar produto: ");
        String produto = sc.next();
        Double preco = sc.nextDouble();
        produtosPrecos.put(produto,preco);
        System.out.println("Adicionar produto: ");
        produto = sc.next();
        preco = sc.nextDouble();
        produtosPrecos.put(produto,preco);
        System.out.println("Adicionar produto: ");
        produto = sc.next();
        preco = sc.nextDouble();
        produtosPrecos.put(produto,preco);
        System.out.println("Pesquisar preço de: ");
        String itemPesquisado = sc.next();
        System.out.println("Preço de " + itemPesquisado + ": "+produtosPrecos.get(itemPesquisado));
        System.out.println("Lista de produtos: "+produtosPrecos);
    }
}
