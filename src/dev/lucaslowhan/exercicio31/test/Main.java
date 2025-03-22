package dev.lucaslowhan.exercicio31.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votos = new HashMap<>();
        int contador = 0;
        while(contador<6){
            System.out.println("Votar em: ");
            String nome = sc.nextLine();
            if(votos.containsKey(nome)){
                votos.put(nome, votos.getOrDefault(nome,0)+1);
            }else{
                votos.put(nome,1);
            }
            contador++;
        }
        System.out.println("Resultado da eleição:"+votos);
    }
}
