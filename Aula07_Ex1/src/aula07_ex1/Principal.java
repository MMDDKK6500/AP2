package aula07_ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual será o tamanho do vetor de números inteiros? ");
        int tamanho = sc.nextInt();
        
        int v_original[] = new int[tamanho];
        int v[] = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("\nNúmero %d \n", i+1);
            
            int valor = sc.nextInt();
            v_original[i] = valor;
            v[i] = valor;
            sc.nextLine();
        }
        
        ordenacaoInsercao(v);
        saida(v, v_original);
    }
    
    
    
    static void ordenacaoInsercao(int v[]){
        int i, j, aux;
        
        for (i = 0; i < v.length; i++) {
            aux  = v[i];
            
            j = i - 1;
            
            while (j >= 0 && v[j] > aux) {
                v[j + 1] = v[j];
                
                j--;
            }
            
            v[j + 1] = aux;
        }
    }
    
    static void saida(int v[], int v_original[]) {
        System.out.println("\nImpressão do Vetor não ordenado");
        System.out.println(Arrays.toString(v_original));
        System.out.println("\nImpresão do Vetor Ordenado");
        System.out.println(Arrays.toString(v));
        System.out.println("\n");
    }
    
}
