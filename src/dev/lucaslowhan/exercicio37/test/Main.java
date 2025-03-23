package dev.lucaslowhan.exercicio37.test;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> filaImpressao = new LinkedList<>();
        System.out.println("Adicionando documento: Relatório.pdf");
        filaImpressao.offer("Relatório.pdf");
        System.out.println("Adicionando documento: TCC.docx");
        filaImpressao.offer("TCC.docx");
        System.out.println("Adicionando documento: Foto.jpg");
        filaImpressao.offer("Foto.jpg");

        System.out.println("Fila de impressão: " + filaImpressao);

        while (!filaImpressao.isEmpty()){
            System.out.println("Imprimindo: "+filaImpressao.poll());
        }
        System.out.println("Fila de impressão vazia.");

    }
}
