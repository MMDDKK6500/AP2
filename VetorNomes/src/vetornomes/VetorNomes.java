package vetornomes;

public class VetorNomes {

    public static void main(String[] args) {
        
        String nomes[] = {"Don Quixote", "Astrogildo Souza", "Patati Patata"};
        
        int n = nomes.length;
        
        for (int i = 0; i < n; i++) {
            System.out.printf("O %dº é: %s\n", (i+1), nomes[i]);
        }
        
    }
    
}
