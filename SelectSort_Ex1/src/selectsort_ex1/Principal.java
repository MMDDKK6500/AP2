package selectsort_ex1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos números inteiros ordenar?");
        int tamanho = sc.nextInt();
        
        int numeros[] = new int[tamanho];
     
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Qual será o %dº número? ", i+1);
            numeros[i] = sc.nextInt();
        }
        
        ordenacaoPorSelecao(numeros);
        saida(numeros);
        
        sc.close();
    }
    
    private static void ordenacaoPorSelecao(int vet[]) {
        int min;
        int k;
        
        for (int i = 0; i < vet.length - 1; i++) {
            min = i;
            for (int j = (i + 1); j < vet.length; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                }
            }
            if (i != min) {
                k = vet[i];
                vet[i] = vet[min];
                vet[min] = k;
            }
        }
    }
    
    private static void saida(int vet[]) {
        System.out.println("\nImpressão do vetor ordenado:\n");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("[%d]", vet[i]);
        }
        System.out.println("\n");
    }
    
}
