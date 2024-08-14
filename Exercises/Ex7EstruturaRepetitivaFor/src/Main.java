import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um número inteiro 
		 * positivo N. O programa deve então mostrar na 
		 * tela N linhas,começando de 1 até N. Para cada 
		 * linha, mostrar o número da linha, depois o 
		 * quadrado e o cubo do valor, conforme exemplo.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int typedNumber;
		
		System.out.println("Olá! Digite o valor que deseja para fazermos o cálculo de quadrado e cubo dos números até ele e dele: ");
		typedNumber = sc.nextInt();
		
		for(int i = 1; i <= typedNumber; i++) {
			System.out.printf("Natural: %d; Quadrado: %.0f; Cubo: %.0f %n", i, Math.pow(i, 2), Math.pow(i, 3));
		}
		
		sc.close();
	}

}
