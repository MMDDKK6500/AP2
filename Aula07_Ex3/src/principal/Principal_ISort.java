package principal;

import java.util.Arrays;
import java.util.Scanner;
import ordenacao.OrdenaInsercao;
import saida_dados.VisualizaSaida;

public class Principal_ISort {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        OrdenaInsercao oi = new OrdenaInsercao();
        VisualizaSaida vs = new VisualizaSaida();
        
        System.out.print("Qual será o tamanho do vetor de nomes completos? ");
        int tamanho = sc.nextInt();
        sc.nextLine();
        
        String v_original[] = new String[tamanho];
        String v[] = new String[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("\nNome número %d: \n", i+1);
            
            String valor = sc.nextLine();
            v_original[i] = valor;
            v[i] = valor;
        }
        
        oi.ordenacaoPorInsercao(v);
        vs.saida(v, v_original);
    }
    
}
