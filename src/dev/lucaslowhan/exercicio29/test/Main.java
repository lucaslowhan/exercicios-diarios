package dev.lucaslowhan.exercicio29.test;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer>stringIntegerHashMap = new HashMap<>();
        System.out.println("Texto: ");
        String texto = sc.nextLine().toLowerCase();

        texto = texto.replaceAll("[^a-zA-ZÀ-ÿ\\s]","");
        String[] textoArr = texto.split("\\s+");
        for(int i = 0; i<textoArr.length;i++){
            if(stringIntegerHashMap.containsKey(textoArr[i])){
                int qtd = stringIntegerHashMap.get(textoArr[i]);
                qtd++;
                stringIntegerHashMap.remove(textoArr[i]);
                stringIntegerHashMap.put(textoArr[i],qtd);
            }else{
                stringIntegerHashMap.put(textoArr[i],1);
            }
        }
        System.out.println("Frequência das palavras: "+stringIntegerHashMap);
    }
}
