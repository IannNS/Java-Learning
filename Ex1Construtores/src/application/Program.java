package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		
		System.out.println("Olá! Bem-vindo(a) ao cadastro do banco Pão!\nDigite os dados para cadastro:\n");

		System.out.print("Número da conta: ");
		int number = sc.nextInt();
		
		System.out.print("Nome: ");
		//Lembre-se de que quando se utiliza o 'nextLine', deve-se adicionar um antecedente para consumo de linha extra.
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Deseja executar um depósito inicial na sua conta (y/n)");
		char response = sc.next().charAt(0);
		
		while(response != 'y' && response != 'n') {
			System.out.println("\nPor favor, digite 'y' se deseja fazer um depósito ou 'n' se não!");
			response = sc.next().charAt(0);
		}
		
		if(response == 'y') {
			System.out.print("\nDigite o valor do depósito inicial: R$");
			double balance = sc.nextDouble();
			account = new Account(name, number, balance);
		}
		else if (response == 'n'){
			account = new Account(name, number);
		}
		
		System.out.println(account.accountData());
		
		System.out.print("\nDigite um valor para depósito: R$");
		double balance = sc.nextDouble();
		account.deposit(balance);
		
		System.out.println(account.accountData());
		
		System.out.print("\nDigite um valor para saque (com taxa de R$5.00 incluso!): R$");
		balance = sc.nextDouble();
		account.withdraw(balance);
		
		System.out.println(account.accountData());
		
		sc.close();

	}

}
