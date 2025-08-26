package bolha2;

import java.util.Scanner;

public class PrincipalBolha2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos nomes ordenar? ");
        int quantidade = sc.nextInt();
        
        sc.nextLine();
        
        // 0xD8 = Ø in Latin-1(ISO-8859-1)
        String vet[] = new String[quantidade];
        
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Nome número %d: ", i+1);
            vet[i] = sc.nextLine();
        }
        
        bsort(vet);
        saida(vet);
        
    }
    
    
    // Bubble Sort
    private static void bsort(String vet[]) {
        String temp;
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
    
    private static void saida(String vet[]) {
        System.out.println("\nImpressão do Vetor Ordenado:\n");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);
            
            //Adition made by me: only print "->" if it isn't the last charcter
            if (i != vet.length - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println("\n");
    }
    
    //Esperado: números -> letras maiúsculas -> letras minúsculas -> simbolos
    
}
