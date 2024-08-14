import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Leia 1 valor inteiro N, que representa o 
		 * número de casos de teste que vem a seguir. 
		 * Cada caso de teste consiste de 3 valores 
		 * reais, cada um deles com uma casa decimal. 
		 * Apresente a média ponderada para cada um 
		 * destes conjuntos de 3 valores, sendo que o 
		 * primeiro valor tem peso 2, o segundo valor 
		 * tem peso 3 e o terceiro valor tem peso 5.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cicle = 0;
		double total = 0;
		
		System.out.println("Olá! Digite o número de ciclos na calculadora de média ponderada: ");
		cicle = sc.nextInt();
		
		for(int i = 0; i < cicle; i++) {
			System.out.println("Digite, em sequência, os números para fazermos a média ponderada: ");
			double sum1 = sc.nextDouble();
			double sum2 = sc.nextDouble();
			double sum3 = sc.nextDouble();
			
			total = (sum1 * 2 + sum2 * 3 + sum3 *5) / 10;
			System.out.printf("Média ponderada: %.1f%n%n", total);
		}
		
		sc.close();
	}

}
