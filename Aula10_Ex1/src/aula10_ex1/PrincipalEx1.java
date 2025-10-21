package aula10_ex1;

import java.util.Scanner;

public class PrincipalEx1 {

    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        
        int resp;
        
        System.out.println("Quantos números inteiros inserir no vetor?");
        int tamanho = sc.nextInt();
        
        int v[] = new int[tamanho];
     
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Qual será o %dº número? ", i+1);
            v[i] = sc.nextInt();
        }
        
        System.out.println("Qual será o número procurado?");
        int pesq = sc.nextInt();
        
        MetodoBusca mBusca = new MetodoBusca();
        
        resp = mBusca.buscaVetDesord(v, pesq);
        
        if (resp >= 0) {
            System.out.printf("%d está na posição %d. \n\n", pesq, resp);
        } else {
            System.out.printf("%d não está no vetor. \n\n", pesq);
        }
    }
    
}
