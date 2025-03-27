package dev.lucaslowhan.exercicio39.test;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Carlos");
        List<Integer> numeros = Arrays.asList(10, 20, 30);
        List<Double> valores = Arrays.asList(1.1, 2.2, 3.3);

        imprimirLista(nomes);
        imprimirLista(numeros);
        imprimirLista(valores);

    }
    static void imprimirLista(List<?> list){
        for(Object o : list){
            System.out.println(o);
        }
    }
}
