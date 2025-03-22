package dev.lucaslowhan.exercicio15.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(
                List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Lista original: "+numeros);
        Iterator<Integer> numerosIterator = numeros.iterator();
        while (numerosIterator.hasNext()){
            if(numerosIterator.next()%2!=0){
                numerosIterator.remove();
            }
        }
        System.out.println("Lista após remoção dos números ímpares: " + numeros);
    }
}
