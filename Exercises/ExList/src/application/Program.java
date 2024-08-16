package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler um número inteiro N e 
		 * depois os dados (id, nome e salario) de N funcionários. 
		 * Não deve haver repetição de id. Em seguida, efetuar o 
		 * aumento de X por cento no salário de um determinado funcionário.
		 * Para isso, o programa deve ler um id e o valor X. Se o 
		 * id informado não existir, mostrar uma mensagem e abortar 
		 * a operação. Ao final, mostrar a listagem atualizada dos funcionários,
		 * conforme exemplos. Lembre-se de aplicar a técnica de 
		 * encapsulamento para não permitir que o salário possa
		 * ser mudado livremente. Um salário só pode ser aumentado 
		 * com base em uma operação de aumento por porcentagem dada.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Olá! Quantos funcionários iremos cadastrar? ");
		int loopTotal = sc.nextInt();
		
		for(int i = 0; i < loopTotal; i++) {
			System.out.printf("Funcionário #%d%n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(employeeList, id)) {
				System.out.println("Este Id já está no sistema! Digite outro: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			//adicionar elemento à lista
			employeeList.add(new Employee(id, name, salary));
		}
		
		System.out.println("Digite o Id do funcionário que deseja aumentar o salário: ");
		int idCheck = sc.nextInt();
		Employee employeeSearch = employeeList.stream().filter(x -> x.getId() == idCheck).findFirst().orElse(null);
		
		if(employeeSearch == null) {
			System.out.println("Esse id de funcionário não existe no sistema!");
		}
		else {
			System.out.println("Digite a porcentagem que deseja adicionar no salário deste funcionário: ");
			double percentage = sc.nextDouble();
			employeeSearch.increaseSalary(percentage);
		}
		
		System.out.println("Lista de funcionários e seus dados: ");
		for(Employee result : employeeList) {
			System.out.println(result);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> idList, int id) {
		Employee employeeSearch = idList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employeeSearch != null;
	}

}
