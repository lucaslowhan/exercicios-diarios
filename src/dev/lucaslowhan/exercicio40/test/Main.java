package dev.lucaslowhan.exercicio40.test;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> decimais = Arrays.asList(1.5, 2.5, 3.5);

        calcularSoma(inteiros);
        calcularSoma(decimais);

    }
    static void calcularSoma(List<? extends Number> list){
        double soma = 0;
        for(Number n : list){
            soma += n.doubleValue();
        }
        System.out.println(soma);
    }
}
