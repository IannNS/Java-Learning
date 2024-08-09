import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler um número N. 
		 * Depois leia N pares de números e mostre 
		 * a divisão do primeiro pelo segundo. Se 
		 * o denominador for igual a zero, mostrar 
		 * a mensagem "divisao impossivel".
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cicle = 0;
		double result, numerator, denominator;
		
		System.out.println("Digite o número de ciclos que deseja realizar: ");
		cicle = sc.nextInt();
		
		for(int i = 0; i < cicle; i++) {
			System.out.println("Digite o numerador: ");
			numerator = sc.nextDouble();
			
			System.out.println("Digite o denominador: ");
			denominator = sc.nextDouble();
			
			if(denominator == 0) {
				System.out.println("Divisão impossível de ser realizada!");
			}
			else {
				result = numerator / denominator;
				
				System.out.printf("Resultado da divisão: %.1f%n", result);
			}
		}
		
		sc.close();
		
	}

}
