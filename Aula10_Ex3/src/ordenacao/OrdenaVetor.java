package ordenacao;

public class OrdenaVetor {

    public void bsort(String vet[]) {
        String temp;
        // Algoritmo de troca do método bolha
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length - (i + 1); j++) {
                if (vet[j].compareToIgnoreCase(vet[j + 1]) > 0) {
                    temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }
    }
    
}
