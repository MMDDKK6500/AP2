package ordenacaobolhanomes;
import java.util.Scanner;

public class OrdenacaoBolhaNomes {

    public static void main(String[] args) {

        Scanner lerNum = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor.: ");
        int tam = lerNum.nextInt();

        String vet[] = new String[tam];

        for (int i = 0; i < tam; i++) {
            System.out.printf("Entre com o %dº nome: ", i+1);
            vet[i] = lerTexto.nextLine();
        }

        bsort(vet); //Método de ordenação
        saida(vet); //Método de impressão dos dados - Saída
        
        lerNum.close();
        lerTexto.close();
    }

    static void bsort(String vet[]) {
        String temp;
        // Algoritmo de troca do método bolha
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

    static void saida( String nomes[]) {
        //Impressão do vetor ordenado!
        System.out.println("\nImpressão do Vetor Ordenado:\n");
        for (String nome : nomes) {
            System.out.printf("%s -> ", nome);
        }
        System.out.println("\n");
    }

}
