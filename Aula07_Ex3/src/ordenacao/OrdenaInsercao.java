package ordenacao;

public class OrdenaInsercao {
    public void ordenacaoPorInsercao(String[] v){
        int i, j;
        String aux;
        
        for (i = 0; i < v.length; i++) {
            aux = v[i];
            
            j = i - 1;
            
            while (j >= 0 && v[j].compareTo(aux) > 0) {
                v[j + 1] = v[j];
                
                j--;
            }
            
            v[j + 1] = aux;
        }
    }
}
