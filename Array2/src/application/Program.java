package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de loops que deseja executar: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("\nDigite o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("\nDigite o preço do produto: R$");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
			
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
				
		System.out.printf("Preço médio dos produtos: R$%.2f", avg);
		
		sc.close();

	}

}
