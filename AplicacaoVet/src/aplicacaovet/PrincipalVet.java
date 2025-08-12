package aplicacaovet;

import java.util.Scanner;

public class PrincipalVet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual será o tamanho do vetor?");
        int tamanho = sc.nextInt();
        
        int vetor[] = new int[tamanho];
        
        System.out.printf("O tamanho do vetor é: %d\n", vetor.length);
        
        for(int i = 0; i < tamanho; i++) {
            System.out.printf("Qual será o valor do índice %d? ", i);
            int valor = sc.nextInt();
            vetor[i] = valor;
        }
        
        for(int i = 0; i < tamanho; i++) {
            System.out.printf("Valor do índice %d acrescentado 100: %d\n", i, vetor[i] + 100);
        }
        
        System.out.println("");
        
    }
    
}
