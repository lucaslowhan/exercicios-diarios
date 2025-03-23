package dev.lucaslowhan.exercicio38.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Paciente> sistemaEmergencia = new PriorityQueue<>();
        sistemaEmergencia.offer(new Paciente("João",2));
        sistemaEmergencia.offer(new Paciente("Maria",5));
        sistemaEmergencia.offer(new Paciente("Carlos",3));
        System.out.println(sistemaEmergencia.poll());
        System.out.println(sistemaEmergencia.poll());
        System.out.println(sistemaEmergencia.poll());

    }
}
