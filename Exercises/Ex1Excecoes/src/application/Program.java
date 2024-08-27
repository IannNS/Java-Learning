package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite os dados da conta: ");
			System.out.print("Número: ");
			int number = sc.nextInt();
			System.out.print("Titular da conta: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Valor inicial em conta: R$");
			double balance = sc.nextDouble();
			System.out.print("Valor limite de saque: R$");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Digite o valor que deseja sacar: R$");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.println("Valor em conta: R$"+account.getBalance());
			
			sc.close();
		}
		catch(DomainException e) {
			System.out.println("Erro no processo: "+e.getMessage());
		}
		catch(RuntimeException e){
			System.out.println("Erro inesperado.");
		}
	}
}
