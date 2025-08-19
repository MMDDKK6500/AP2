package ado1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas será calculado o IMC?");
        int quantiaPessoas = sc.nextInt();
        sc.nextLine();

        CalculaIMC pessoas[] = new CalculaIMC[quantiaPessoas];
        
        for (int i = 0; i < quantiaPessoas; i++) {
            System.out.printf("\nDados da %dº pessoa \n", i+1);
            
            pessoas[i] = new CalculaIMC();
            
            System.out.print("Nome: ");
            pessoas[i].nome = sc.nextLine();
            System.out.print("Altura (m): ");
            pessoas[i].altura = sc.nextFloat();
            System.out.print("Peso (Kg): ");
            pessoas[i].peso = sc.nextFloat();
            sc.nextLine();
        }
        
        for (int i = 0; i < quantiaPessoas; i++) {
            float imc = pessoas[i].calcularIMC();
            System.out.printf("\nIMC da %dº pessoa é: %.2f\n", i+1, imc);
            
            String categoria = pessoas[i].categorizarIMC();
            System.out.println(categoria);
        }
        
    }
    
}
