package saida_dados;

public class VisualizaSaida {
    public void saida(String v[], String v_original[]) {
        System.out.println("\nNomes completos desordenados:");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("\tNome completo número %d: %s\n", i+1, v_original[i]);
        }
        System.out.println("\nNomes completos ordenados:");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("\tNome completo número %d: %s\n", i+1, v[i]);
        }
        System.out.println("\n");
    }    
}
