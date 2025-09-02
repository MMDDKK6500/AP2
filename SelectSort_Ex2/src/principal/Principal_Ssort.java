package principal;

import java.util.Scanner;
import ordenacao.OrdenaSelecao;
import saida_dados.VisualizaSaida;

public class Principal_Ssort {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        OrdenaSelecao os = new OrdenaSelecao();
        VisualizaSaida vs = new VisualizaSaida();
        
        System.out.println("Quantos nomes completos ordenar?");
        int tamanho = sc.nextInt();
        
        sc.nextLine();
        
        String[] nomes = new String[tamanho];
     
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Qual será o %dº nome? ", i+1);
            nomes[i] = sc.nextLine();
        }
        
        os.ordenacaoPorSelecao(nomes);
        vs.visualizaItens(nomes);
        
        sc.close();
    }
    
}
