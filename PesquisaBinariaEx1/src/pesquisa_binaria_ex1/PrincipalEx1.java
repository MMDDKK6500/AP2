package pesquisa_binaria_ex1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class PrincipalEx1 {

    public static void main(String[] args) {        
        int resp;
        
        int tam = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Qual será o tamanho do vetor a ser pesquisado? ")
        );
        int vet[] = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual será o valor do " + (i + 1) + "º valor do vetor? "));
        }
        
        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual será o número a ser procurado no vetor? "));
        
        ordenacaoPorInsercao(vet);
        
        JOptionPane.showMessageDialog(null, Arrays.toString(vet));
        
        resp = buscaBin(vet, busca);
        
        if (resp >= 0) {
            JOptionPane.showMessageDialog(null, busca + " está na posição " + resp);
        } else {
            JOptionPane.showMessageDialog(null, busca + " não está no vetor");
        }
    }
    
    public static void ordenacaoPorInsercao(int v[]){
        int i, j, aux;
        
        for (i = 0; i < v.length; i++) {
            aux  = v[i];
            
            j = i - 1;
            
            while (j >= 0 && v[j] > aux) {
                v[j + 1] = v[j];
                
                j--;
            }
            
            v[j + 1] = aux;
        }
    }
    
    public static int buscaBin(int v[], int pesquisa) {
        int inicio = 0, fim, metade;
        fim = v.length - 1;
        
        while (inicio <= fim) {
            metade = (inicio + fim) / 2;
            
            if (v[metade] == pesquisa) {
                return metade;
            }
            
            if (pesquisa < v[metade]) {
                fim = metade - 1;
            } else {
                inicio = metade + 1;
            }
        }
        return -1;
    }
    
}
