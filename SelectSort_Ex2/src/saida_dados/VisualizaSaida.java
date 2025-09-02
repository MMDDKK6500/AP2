package saida_dados;

public class VisualizaSaida {
    public void visualizaItens(String vet[]) {
        System.out.println("\n\tImpressão dos nomes me ordem\n");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("\t%dº nome: %s\n", i+1,vet[i]);
        }
        System.out.println("\n");
    }
}
