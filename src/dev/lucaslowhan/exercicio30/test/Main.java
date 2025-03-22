package dev.lucaslowhan.exercicio30.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> agendaTelefonica = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador<3) {
            System.out.println("Adicionar contato:");
            String nome = sc.next();
            String numero = sc.next();
            agendaTelefonica.put(nome,numero);
            contador++;
        }
        System.out.println("Pesquisar telefone de : ");
        System.out.println(agendaTelefonica.get(sc.next()));
        System.out.println("Lista de contatos: " + agendaTelefonica);

    }
}
