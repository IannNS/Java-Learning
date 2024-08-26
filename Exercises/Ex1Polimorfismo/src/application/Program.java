package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Quantos funcionários deseja salvar no sistema? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nFuncionário N°"+(i+1)+":");
			System.out.print("Este funcionário é terceirisado (y/n)?");
			char outsourced = sc.next().charAt(0);
			System.out.print("Nome do funcionário: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			Integer hoursWorked = sc.nextInt();
			System.out.print("Valor recebido por hora de trabalho: R$");
			Double valuePerHour = sc.nextDouble();
			
			if(outsourced == 'y') {
				System.out.print("Valor de consumo adicional do funcionário: ");
				Double additionalCharge = sc.nextDouble();
				employeeList.add(new OutsourcedEmployee(name, hoursWorked, valuePerHour, additionalCharge));
			}
			else {
				//Boa prática
				employeeList.add(new Employee(name, hoursWorked, valuePerHour));
			}
		}
		
		System.out.println("\nValor de pagamento do(s) funcionário(s): ");
		for(Employee emp : employeeList) {
			System.out.println(emp.toString());
		}
		
		sc.close();
		
	}

}
