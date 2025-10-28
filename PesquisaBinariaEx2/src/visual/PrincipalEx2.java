package visual;

import java.util.Arrays;
import javax.swing.JOptionPane;
import static ordenacao.OrdenaVetor.bSortString;
import static pesquisa.PesquisaNome.buscaBin;

public class PrincipalEx2 {

    public static void main(String[] args) {
        int resp;
        
        int tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual será o tamanho do vetor a ser pesquisado? "));
        String vet[] = new String[tam];
        
        for (int i = 0; i < tam; i++) {
            vet[i] = JOptionPane.showInputDialog(null, "Qual será o " + (i + 1) + "º nome do vetor? ");
        }
        
        String busca = JOptionPane.showInputDialog(null, "Qual será o nome a ser procurado no vetor? ");
        
        bSortString(vet);
        
        JOptionPane.showInputDialog(null, Arrays.toString(vet));
        
        resp = buscaBin(vet, busca);
        
        if (resp >= 0) {
            JOptionPane.showMessageDialog(null, busca + " é o " + resp + "º nome.");
        } else {
            JOptionPane.showMessageDialog(null, busca + " não está no vetor");
        }
    }
    
}
