package aplicacaovet;

import java.util.Scanner;

public class PrincipalVet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual ser� o tamanho do vetor?");
        int tamanho = sc.nextInt();
        
        int vetor[] = new int[tamanho];
        
        System.out.format("O tamanho do vetor �: %d\n", vetor.length);
        
        for(int i = 0; i < tamanho; i++) {
            System.out.format("Qual ser� o valor do �ndice %d? ", i);
            int valor = sc.nextInt();
            vetor[i] = valor;
        }
        
        for(int i = 0; i < tamanho; i++) {
            System.out.format("Valor do �ndice %d: %d\n", i, vetor[i]);
        }
        
    }
    
}
