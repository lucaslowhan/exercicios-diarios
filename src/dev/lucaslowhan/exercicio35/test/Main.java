package dev.lucaslowhan.exercicio35.test;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
Exercício 3: Controle de Estoque
Crie um programa que gerencie o estoque de produtos usando TreeMap<String, Integer>, onde a chave é o nome do produto e o valor é a quantidade disponível.

✔ Adicione produtos ao estoque.
✔ Permita ao usuário verificar a quantidade de um produto específico.
✔ Exiba todos os produtos em ordem alfabética.
✔ Exiba o primeiro e o último produto da lista.
*/

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> controleEstoque = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de produtos que deseja adicionar:");
        int quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Nome do produto:");
            String nome = sc.next();
            System.out.println("Quantidade:");
            int valor = sc.nextInt();
            controleEstoque.put(nome,valor);
        }
        System.out.println("Digite o produto que deseja verificar:");
        String produtoVerificavel = sc.next();
        if(controleEstoque.containsKey(produtoVerificavel)){
            System.out.println(produtoVerificavel + " " + controleEstoque.get(produtoVerificavel));
        }else {
            System.out.println("Produto não encontrado");
        }
        System.out.println("----------");
        for(Map.Entry<String,Integer>entrada : controleEstoque.entrySet()){
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
        System.out.println("----------");
        System.out.println(controleEstoque.firstEntry());
        System.out.println(controleEstoque.lastEntry());
    }
}
