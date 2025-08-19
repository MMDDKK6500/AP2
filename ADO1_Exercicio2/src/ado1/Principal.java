package ado1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pessoa listaPessoas[] = new Pessoa[5];

        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.printf("Dados da %dº pessoa\n", i+1);
            listaPessoas[i] = new Pessoa();
            System.out.print("Nome: ");
            listaPessoas[i].nome = sc.nextLine();
            System.out.print("Telefone: ");
            listaPessoas[i].telefone = sc.nextLine();
            System.out.print("Idade: ");
            listaPessoas[i].idade = sc.nextInt();
            sc.nextLine();
            System.out.print("RG: ");
            listaPessoas[i].rg = sc.nextLine();
            System.out.print("CPF: ");
            listaPessoas[i].cpf = sc.nextLine();
            System.out.print("Endereço: ");
            listaPessoas[i].endereco = sc.nextLine();
            System.out.print("CEP: ");
            listaPessoas[i].cep = sc.nextLine();
            System.out.print("Cidade: ");
            listaPessoas[i].cidade = sc.nextLine();
            System.out.print("Estado: ");
            listaPessoas[i].estado = sc.nextLine();
            
        }
        
        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.printf("\nDados da %dº pessoa:\n", i+1);
            System.out.println("\tNome: " + listaPessoas[i].nome);
            System.out.println("\tTelefone: " + listaPessoas[i].telefone);
            System.out.println("\tIdade: " + listaPessoas[i].idade);
            System.out.println("\tRG: " + listaPessoas[i].rg);
            System.out.println("\tCPF: " + listaPessoas[i].cpf);
            System.out.println("\tEndereço: " + listaPessoas[i].endereco);
            System.out.println("\tCEP: " + listaPessoas[i].cep);
            System.out.println("\tCidade: " + listaPessoas[i].cidade);
            System.out.println("\tEstado: " + listaPessoas[i].estado);
            
        }
    }
    
}
