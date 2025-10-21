package aula10_ex2;

public class MetodoBusca {
    
    public static int buscaSeq(int vet[], int busca) {
        for(int i = 0; i< vet.length; i++) {
            if (vet[i] == busca) {
                return i;
            } else if (vet[i] > busca) {
                return -1;
            }
        }
        return -1;
    }
    
}
