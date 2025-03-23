package dev.lucaslowhan.exercicio36.test;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        System.out.println("Adicionando: Cliente 1");
        fila.add("Cliente 1");
        System.out.println("Adicionando: Cliente 2");
        fila.add("Cliente 2");
        System.out.println("Adicionando: Cliente 3");
        fila.add("Cliente 3");
        System.out.println("Fila de espera: " + fila);
        System.out.println("Chamando: " + fila.poll());
        System.out.println("Fila atualizada: " + fila);
    }
}
