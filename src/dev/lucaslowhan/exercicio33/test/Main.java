package dev.lucaslowhan.exercicio33.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;
/* NavigableMap
Exercício 1: Agenda Telefônica
Crie um programa que armazene nomes e números de telefone em um TreeMap<String, String>.

✔ Permita que o usuário adicione novos contatos.
✔ Permita que o usuário busque um número pelo nome.
✔ Exiba os contatos em ordem alfabética.
*/
public class Main {
    public static void main(String[] args) {
        NavigableMap<String, String> agendaTelefonica = new TreeMap<>(); // Criação de NavigableMap
        Scanner sc = new Scanner(System.in); // Classe scanner para ler dados digitados
        System.out.println("Quantos contatos deseja adicionar ?");
        int contador = sc.nextInt();
        for(int i = 0; i<contador;i++){
            System.out.println("Digite o nome do contato:");
            String nome = sc.next();
            System.out.println("Digite o numero:");
            String numero = sc.next();
            agendaTelefonica.put(nome,numero);
        }
        System.out.println("Qual nome deseja buscar na agenda?");
        String nomeBusca = sc.next();
        System.out.println(agendaTelefonica.get(nomeBusca));
        System.out.println("Agenda telefonica\n");
        for(Map.Entry<String,String> entrada : agendaTelefonica.entrySet()){
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
