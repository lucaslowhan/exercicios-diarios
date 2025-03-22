package dev.lucaslowhan.exercicio14.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> cidades = new ArrayList<>(
                List.of("São Paulo" , "Rio de Janeiro" ,
                        "Belo Horizonte" , "Salvador" ,
                        "Curitiba"));
        ListIterator<String> cidadesIterator = cidades.listIterator();
        System.out.println("Lista de cidades na ordem original:");
        while (cidadesIterator.hasNext()){
            System.out.println(cidadesIterator.next());
        }
        System.out.println("Lista de cidades na ordem reversa:");
        while (cidadesIterator.hasPrevious()){
            System.out.println(cidadesIterator.previous());
        }
    }
}
