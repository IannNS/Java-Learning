package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite o nome do departamento: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Digite os dados do funcionário: ");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Grau: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salário Bruto: ");
		double baseSalary = sc.nextDouble();
		
		//Instancia do novo funcionário 
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("Quantos contratos esse funcionário tem? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.printf("%nContrato N°%d: %n", i);
			System.out.print("Data (dd/MM/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println(); 
		System.out.print("Digite o mês e o ano para calcular-mos o total a ser pago (MM/yyyy): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Nome do funcionário: " +worker.getName());
		System.out.println("Departamento do funcionário: " +worker.getDepartment().getName());
		System.out.println("Total para a data " +monthAndYear+ ": " +String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
