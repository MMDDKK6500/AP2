package pesquisa;

public class PesquisaNome {
    public static int buscar(String vet[], String busca) {
        for(int i = 0; i< vet.length; i++) {
            if (vet[i].equals(busca)) {
                return i;
            } else if (vet[i].compareToIgnoreCase(busca) > 0) {
                return -1;
            }
        }
        return -1;
    }
}
