package visual;

import java.util.Arrays;
import java.util.Scanner;
import ordenacao.OrdenaVetor;
import pesquisa.PesquisaNome;

public class PrincipalEx3 {

    public static void main(String[] args) {
        
        Scanner lerNum = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        OrdenaVetor oVetor = new OrdenaVetor();

        System.out.print("Informe o tamanho do vetor: ");
        int tam = lerNum.nextInt();

        String vet[] = new String[tam];

        for (int i = 0; i < tam; i++) {
            System.out.printf("Entre com o %dº nome: ", i+1);
            vet[i] = lerTexto.nextLine();
        }

        oVetor.bsort(vet);
        
        System.out.println("Qual nome você deseja procurar?");
        String busca = lerTexto.nextLine();
        
        int buscaCompleta = PesquisaNome.buscar(vet, busca);
        saida(vet, buscaCompleta);
        
        lerNum.close();
        lerTexto.close();
        
    }
    
    static void saida(String nomes[], int busca) {
        System.out.println("\nImpressão do Vetor Ordenado:\n");
        System.out.println(Arrays.toString(nomes));
        if (busca >= 0) {
            System.out.println("");
            System.out.printf("%s está na posição %d. \n", nomes[busca], busca);
        } else {
            System.out.printf("Este nome não está no vetor. \n");
        }
    }
    
}
