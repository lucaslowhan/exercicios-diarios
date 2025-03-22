package dev.lucaslowhan.exercicio12.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cores = new ArrayList<>(
                List.of("Azul", "Verde", "Vermelho",
                        "Amarelo", "Branco"));
        System.out.println("Cores disponíveis: "+cores);
        System.out.println("Digite a cor que deseja remover: ");
        String corDesejada = sc.nextLine();
        Iterator<String> coresIterator = cores.iterator();
        while (coresIterator.hasNext()){
            if(coresIterator.next().equals(corDesejada)){
                coresIterator.remove();
            }
        }
        System.out.println("Lista após remoção: "+cores);
    }
}
