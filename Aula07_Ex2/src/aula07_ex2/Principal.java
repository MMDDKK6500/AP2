package aula07_ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos salários ordenar? ");
        int tamanho = sc.nextInt();
        
        double v_original[] = new double[tamanho];
        double v[] = new double[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("\nSalário número %d: \n", i+1);
            
            double valor = sc.nextDouble();
            v_original[i] = valor;
            v[i] = valor;
            sc.nextLine();
        }
        
        ordenacaoInsercao(v);
        saida(v, v_original);
    }
    
    static void ordenacaoInsercao(double v[]){
        int i, j;
        double aux;
        
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
    
    static void saida(double v[], double v_original[]) {
        System.out.println("\nSalários desordenados:");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("\tSalário número %d: %.2f\n", i+1, v_original[i]);
        }
        System.out.println("\nSalários ordenados:");
        for (int i = 0; i < v.length; i++) {
            double ajuste = v[i] * 1.15;
            System.out.printf("\tSalário número %d: %.2f - Salário reajustado em 15 porcento: %.2f\n", i+1, v[i], ajuste);
        }
        System.out.println("\n");
    }
    
}