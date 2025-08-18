package arraytipado;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pessoa listaPessoas[] = new Pessoa[3];
        
        /*
        
        listaPessoas[0] = new Pessoa();
        listaPessoas[0].nome = "Zé Colmeia";
        listaPessoas[0].email = "zecolmeia@gmail.com";
        listaPessoas[0].telefone = "11 99976-4455";
        listaPessoas[0].idade = 41;
        
        listaPessoas[1] = new Pessoa();
        listaPessoas[1].nome = "Juca Bala";
        listaPessoas[1].email = "juca_bala@gmail.com";
        listaPessoas[1].telefone = "11 97776-5544";
        listaPessoas[1].idade = 37;
        
        */

        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.printf("\n\tDados da %dº pessoa \n", i+1);
            listaPessoas[i] = new Pessoa();
            System.out.print("Nome: ");
            listaPessoas[i].nome = sc.nextLine();
            System.out.print("Email: ");
            listaPessoas[i].email = sc.nextLine();
            System.out.print("Telefone: ");
            listaPessoas[i].telefone = sc.nextLine();
            System.out.print("Idade: ");
            listaPessoas[i].idade = sc.nextInt();
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
