package dev.lucaslowhan.exercicio41.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numeros = new ArrayList<>();
        adicionarNumeros(numeros);
        System.out.println(numeros);

        List<Number> numerosObj = new ArrayList<>();
        adicionarNumeros(numerosObj);
        System.out.println(numerosObj);

    }
    static void adicionarNumeros(List<? super Integer> list){
        list.add(10);
        list.add(20);
        list.add(30);
    }
}
