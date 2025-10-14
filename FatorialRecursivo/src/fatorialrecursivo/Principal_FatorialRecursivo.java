package fatorialrecursivo;

public class Principal_FatorialRecursivo {
    
    public static int fatorial(int n) {
        
        if (n == 1 || n == 0) {
            return n;
        } else {
            return n * fatorial(n - 1);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println("Fatorial de 5: " + fatorial(5));
    }
    
}
