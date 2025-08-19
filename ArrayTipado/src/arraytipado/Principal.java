package arraytipado;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pessoa listaPessoas[] = new Pessoa[3];

        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.printf("\nDados da %dº pessoa \n", i+1);
            listaPessoas[i] = new Pessoa();
            System.out.print("Nome: ");
            listaPessoas[i].nome = sc.nextLine();
            System.out.print("Email: ");
            listaPessoas[i].email = sc.nextLine();
            System.out.print("Telefone: ");
            listaPessoas[i].telefone = sc.nextLine();
            System.out.print("Idade: ");
            listaPessoas[i].idade = sc.nextInt();
            
            //GPT-5 sugeriu isso pra arrumar o problema de o enter ir das vezes, eu sabia que era algo assim mas não sabia o que exatamente, chat gpt my beloved <3(mal uso)
            sc.nextLine();
        }
        
        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.printf("\n\tDados da %dº pessoa \n", i+1);
            System.out.println("\t" + listaPessoas[i].nome);
            System.out.println("\t" + listaPessoas[i].email);
            System.out.println("\t" + listaPessoas[i].telefone);
            System.out.println("\t" + listaPessoas[i].idade);
            
        }
        
    }
    
}
