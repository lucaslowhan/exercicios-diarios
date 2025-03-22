package dev.lucaslowhan.exercicio6.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(new Produto("Celular",1500.00));
        produtoList.add(new Produto("TV",2500.00));
        produtoList.add(new Produto("Tablet",500.00));
        produtoList.add(new Produto("Ipad",4500.00));
        System.out.println(produtoList);
        Collections.sort(produtoList);
        System.out.println(produtoList);
        produtoList.sort(Comparator.comparing(Produto::getNome));
        System.out.println(produtoList);
    }
}
