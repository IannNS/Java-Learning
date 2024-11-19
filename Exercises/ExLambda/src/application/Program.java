package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
import model.services.EmployeeService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho até o arquivo: ");
		String path = sc.next();
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<>();
			
			System.out.print("Digite o valor do salário: ");
			double salaryCalc = sc.nextDouble();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			// Filtra quem tem salário maior que o definido.
			List<String> emails = list.stream()
					.filter(p -> p.getSalary() >= salaryCalc)
					.map(p -> p.getEmail()).sorted()
					.collect(Collectors.toList());
			
			System.out.println("\nE-mail dos(as) funcionários(as) cujo salário é maior que "+salaryCalc+":");
			emails.forEach(System.out::println);
			
			// Passa o critério com a lista de funcionários. 
			EmployeeService es = new EmployeeService();
			double salarySum = es.filteredSum(list, p -> p.getName().charAt(0) == 'M');
			System.out.println("Soma dos salários das pessoas cujo nome começa com 'M': "+ String.format("%.2f", salarySum));
			
		}
		catch(Exception e) {
			System.out.println("Erro: "+ e.getMessage());
		}
		
		sc.close();

	}

}
