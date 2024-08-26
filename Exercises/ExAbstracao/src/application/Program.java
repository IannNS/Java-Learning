package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contributor;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contributor> contributors = new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes que iremos salvar: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Contribuinte N°"+i+": ");
			System.out.print("Tipo de contribuinte (i/c): ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine()	;
			System.out.print("Produção anual: ");
			double anualIncome = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Gasto com saúde: ");
				double healthCare = sc.nextDouble();
				
				contributors.add(new Individual(name, anualIncome, healthCare));
			}
			else {
				System.out.print("Número de funcionários: ");
				int employeeNumber = sc.nextInt();
				
				contributors.add(new Company(name, anualIncome, employeeNumber));
			}
				
		}

		double totalFee = 0.0;
		System.out.println("\nIMPOSTOS PAGOS:");
		for(Contributor c : contributors) {
			
			System.out.println(c.getName()+": R$"+String.format("%.2f", c.profitFee()));
			totalFee += c.profitFee();
			
		}
		
		System.out.printf("\nTOTAL EM IMPOSTOS: R$"+String.format("%.2f", totalFee));
		
		sc.close();

	}

}
