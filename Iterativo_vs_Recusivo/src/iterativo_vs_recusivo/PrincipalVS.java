package iterativo_vs_recusivo;

public class PrincipalVS {
    
    public static void main(String[] args) {
        
        long fat = 48;
        
        long tempo1 = System.currentTimeMillis();
        
        FAT_Iterativo fi = new FAT_Iterativo();
        fi.fatorialIterativo(fat);
        
        long tempo2 = System.currentTimeMillis();
        
        System.out.println(tempo1);
        System.out.println(tempo2);
        System.out.println("Tempo: " + (tempo2 - tempo1));
        
    }
    
}
