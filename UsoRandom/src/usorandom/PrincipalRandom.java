package usorandom;

import java.util.Arrays;
import java.util.Random;

public class PrincipalRandom {

    public static void main(String[] args) {
        
        int tam = 10;
        
        long vet[] = new long[tam];
        
        Random rd = new Random();
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rd.nextInt(100);
            //vet[i] = Math.abs(rd.nextLong() % 1_000_000_000L);
        }
        
        System.out.println(Arrays.toString(vet));

        
    }

}
