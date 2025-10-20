package pesquisavdesord;

public class Principal {

    public static void main(String[] args) {
        
        int pesq, resp;
        int v[] = {6, 2, 7, 8, -1, 34, 22, 46, 9, -10};
        
        pesq = -1;
        MetodoBusca mBusca = new MetodoBusca();
        
        resp = mBusca.buscaVetDesord(v, pesq);
        
        if (resp >= 0) {
            System.out.printf("%d está na posição %d. \n\n", pesq, resp);
        } else {
            System.out.printf("%d não está no vetor. \n\n", pesq);
        }
    }
    
}
