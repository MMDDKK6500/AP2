package bolha1;

public class PrincipalBolha1 {

    public static void main(String[] args) {
        
        
        // 0xD8 = Ø in Latin-1(ISO-8859-1)
        char vet[] = {'s', 'z', 0xD8, 'c', 'a', 'f', '5', 'D', '3'};
        
        bsort(vet);
        saida(vet);
        
    }
    
    
    // Bubble Sort
    private static void bsort(char vet[]) {
        char temp;
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length - (i + 1); j++) {
                if (vet[j] > vet[j + 1]) {
                    temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }
    }
    
    private static void saida(char vet[]) {
        System.out.println("\nImpressão do Vetor Ordenado:\n");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%c -> ", vet[i]);
        }
        System.out.println("\n");
    }
    
    //Esperado: números -> letras maiúsculas -> letras minúsculas -> simbolos
    
}
