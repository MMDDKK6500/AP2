package aula10_ex2;

public class Ordenacao {
    public static void ordenacaoInsercao(int v[]){
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
}
