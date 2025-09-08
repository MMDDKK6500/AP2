package metodo_ordenacaoinsercao;

import java.util.Arrays;

public class Principal_Insercao {

    public static void main(String[] args) {
        int v[] = {8, 2, 4, 9, 3, 6, 7, 1};
        
        ordenacaoInsercao(v);
        saida(v);
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
    
    static void saida(int v[]) {
        System.out.println("\nImpressão do Vetor Ordenado");
        System.out.println(Arrays.toString(v));
        System.out.println("\n");
    }
    
}
