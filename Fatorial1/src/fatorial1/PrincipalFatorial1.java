package fatorial1;

public class PrincipalFatorial1 {
    
    public static int fatorial(int n) {
        
        int resultado = 1;
        
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println("Fatorial de 5: " + fatorial(5));
    }
    
}
