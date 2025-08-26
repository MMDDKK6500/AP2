package bolha1;

import java.util.Scanner;

public class PrincipalBolha1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos caracteres ordenar? ");
        int quantidade = sc.nextInt();
        
        // 0xD8 = Ø in Latin-1(ISO-8859-1)
        char vet[] = new char[quantidade];
        
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Caractere número %d: ", i+1);
            vet[i] = sc.next().charAt(0);
        }
        
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
