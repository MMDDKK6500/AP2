package aplicacaovet;

import java.util.Scanner;

public class PrincipalVet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tamanho = 5;
        
        int vetor[] = new int[tamanho];
        
        
        for(int i = 0; i < tamanho; i++) {
            System.out.printf("Qual ser� o valor do �ndice %d? ", i);
            int valor = sc.nextInt();
            vetor[i] = valor;
        }
        
        int soma = 0;
        int menor = vetor[0];
        int maior = vetor[0];
        
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
            
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        
        System.out.println("\n\t\t - Sa�das -\n");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == menor) {
                System.out.printf("vetor[%d] = %d <---- menor valor\n", i, vetor[i]);
            } else if (vetor[i] == maior) {
                System.out.printf("vetor[%d] = %d <---- maior valor\n", i, vetor[i]);
            } else {
                System.out.printf("vetor[%d] = %d\n", i, vetor[i]);
            }
        }
        
        System.out.printf("%d � a soma dos valores. \n", soma);
        
        sc.close();
        
    }
    
}
