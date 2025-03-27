package dev.lucaslowhan.exercicio42.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(5, 3, 9, 1);
        List<Double> decimais = Arrays.asList(2.5, 3.8, 1.2);
        List<String> nomes = Arrays.asList("Ana", "Carlos", "Beatriz");

        System.out.println(encontrarMaior(inteiros));
        System.out.println(encontrarMaior(decimais));
        System.out.println(encontrarMaior(nomes));

    }
    static <T extends Comparable<T>> T encontrarMaior(List<? extends T> list){
        if((list.isEmpty() || list == null)){
            throw new IllegalArgumentException("Lista vazia ou nula");
        }
        return Collections.max(list);
    }
}
