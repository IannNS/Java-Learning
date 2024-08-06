import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*Fazer um programa que leia o número de um funcionário, seu 
		 * número de horas trabalhadas, o valor que recebe por hora e 
		 * calcula o salário desse funcionário. A seguir, mostre o 
		 * número e o salário do funcionário, com duas casas decimais.
		 */
		Scanner sc = new Scanner(System.in);
		int funcId, workedHours;
		double hourPayment, salary;
		
		System.out.println("Olá! Digite os valores desejados para que façamso o cálculo do seu salário!");
		
		System.out.println("Id do funcionário: ");
		funcId = sc.nextInt();
		
		System.out.println("Número de horas trabalhadas: ");
		workedHours = sc.nextInt();
		
		System.out.println("Salário pago por hora de trabalho: ");
		hourPayment = sc.nextDouble();
		
		salary = workedHours * hourPayment;
		System.out.printf("Salário do funcionário de ID %d é: R$%.2f%n", funcId, salary);
		sc.close();
	}

}
