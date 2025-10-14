package iterativo_vs_recusivo;

public class FAT_Iterativo {

    public static long fatorialIterativo(long n) {
        
        long resultado = 1;
        
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
}
