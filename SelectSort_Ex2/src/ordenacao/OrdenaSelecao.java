package ordenacao;

public class OrdenaSelecao {
    public void ordenacaoPorSelecao(String vet[]) {
        int min;
        String k;
        
        for (int i = 0; i < vet.length - 1; i++) {
            min = i;
            for (int j = (i + 1); j < vet.length; j++) {
                if (vet[j].compareTo(vet[min]) < 0) {
                    min = j;
                }
            }
            if (i != min) {
                k = vet[i];
                vet[i] = vet[min];
                vet[min] = k;
            }
        }
    }
}
