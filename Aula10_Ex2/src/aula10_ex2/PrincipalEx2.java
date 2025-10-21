package aula10_ex2;

import java.util.Arrays;
import java.util.Scanner;

public class PrincipalEx2 {

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
        
        Ordenacao.ordenacaoInsercao(v);
        System.out.println(Arrays.toString(v));
        
        resp = MetodoBusca.buscaSeq(v, pesq);
        
        if (resp >= 0) {
            System.out.printf("%d está na posição %d. \n\n", pesq, resp);
        } else {
            System.out.printf("%d não está no vetor. \n\n", pesq);
        }
    }
    
}
