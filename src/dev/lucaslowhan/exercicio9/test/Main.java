package dev.lucaslowhan.exercicio9.test;

import dev.lucaslowhan.exercicio9.domain.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(new Produto("TV",1999.99));
        produtoList.add(new Produto("Iphone 15",4999.99));
        produtoList.add(new Produto("Ipad",3999.99));
        produtoList.add(new Produto("XBOX SERIES X",2499.99));
        produtoList.add(new Produto("PS5",3799.99));
        System.out.println("Lista original: " + produtoList);
        Collections.sort(produtoList);
        System.out.println("Ordenado por preço crescente: " + produtoList);
        produtoList.sort(Comparator.comparing(Produto::getNome));
        System.out.println("Ordenado por nome (ordem alfabética): "+produtoList);
    }
}
