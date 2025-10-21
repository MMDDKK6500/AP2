package aula10_ex1;

public class MetodoBusca {
    
    public int buscaVetDesord(int vet[], int busca) {
        for(int i = 0; i< vet.length; i++) {
            if (vet[i] == busca) return i;
        }
        return -1;
    }
    
}
