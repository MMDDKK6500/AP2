package iterativo_vs_recusivo;

public class FAT_Recursivo {

    public static int fatorialRecursivo(int n) {
        
        if (n == 1 || n == 0) {
            return n;
        } else {
            return n * fatorialRecursivo(n - 1);
        }
        
    }
    
}
