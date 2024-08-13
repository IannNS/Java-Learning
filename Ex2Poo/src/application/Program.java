package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Digte os dados do funcionário, sendo: \nNome: \nSalário bruto\nImposto:");
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.printf("Dados do funcionário: %s, R$%.2f%n", employee.name, employee.NetSalary());
		
		System.out.println("Digite uma porcentagem de aumento para o salário: ");
		employee.IncreaseSalary(sc.nextDouble());
		
		System.out.printf("Dados atualizados do funcionário: %s, R$%.2f%n", employee.name, employee.NetSalary());
		
		sc.close();
	}
}
