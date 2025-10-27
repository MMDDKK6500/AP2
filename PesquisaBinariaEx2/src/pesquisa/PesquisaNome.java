package pesquisa;

public class PesquisaNome {
    public static int buscaBin(String v[], String pesquisa) {
        int inicio = 0, fim, metade;
        fim = v.length - 1;
        
        while (inicio <= fim) {
            metade = (inicio + fim) / 2;
            
            if (v[metade].equals(pesquisa)) {
                return metade;
            }
            
            if (v[metade].compareToIgnoreCase(pesquisa) > 0) {
                fim = metade - 1;
            } else {
                inicio = metade + 1;
            }
        }
        return -1;
    }
}
