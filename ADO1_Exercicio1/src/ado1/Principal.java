package ado1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CalculaIMC calculaIMC = new CalculaIMC();
        
        
        System.out.println("Quantas pessoas será calculado o IMC?");
        int quantiaPessoas = sc.nextInt();

        float alturaLista[] = new float[quantiaPessoas];
        float pesoLista[] = new float[quantiaPessoas];
        
        for (int i = 0; i < quantiaPessoas; i++) {
            System.out.printf("\nDados da %dº pessoa \n", i+1);

            System.out.print("Altura (m): ");
            alturaLista[i] = sc.nextFloat();
            System.out.print("Peso (Kg): ");
            pesoLista[i] = sc.nextFloat();
            
            sc.nextLine();
        }
        
        for (int i = 0; i < quantiaPessoas; i++) {
            float imc = calculaIMC.calcularIMC(alturaLista[i], pesoLista[i]);
            System.out.printf("\nIMC da %dº pessoa é: %.2f\n", i+1, imc);
            
            if (imc < 18.5f) {
                System.out.println("Classificado como baixo peso.");
            } else if (imc < 24.9f) {
                System.out.println("Classificado como peso adequado.");
            } else if (imc < 29.9f) {
                System.out.println("Classificado como sobrepeso.");
            } else  {
                System.out.println("Classificado como obesidade.");
            }
        }
        
    }
    
}
