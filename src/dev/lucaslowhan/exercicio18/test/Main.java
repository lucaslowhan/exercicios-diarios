package dev.lucaslowhan.exercicio18.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> cidades = new HashSet<>(Set.of("São Paulo" ,
                "Rio de Janeiro" , "Belo Horizonte" , "Salvador" ,
                "Curitiba"));
        System.out.println("Lista de cidades: " + cidades);
        System.out.println("Digite uma cidade para remover: ");
        String cidade = sc.nextLine();
        Iterator<String> cidadesIterator = cidades.iterator();
        while (cidadesIterator.hasNext()){
            if(cidadesIterator.next().equals(cidade)){
                System.out.println("Cidade removida com sucesso!");
                cidadesIterator.remove();
            }
        }
        System.out.println("Lista de cidades atualizada: "+ cidades);
    }
}
