import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Ler um número inteiro N e calcular todos os seus divisores
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numerator;
		
		System.out.println("Olá! Digite um número para verificarmos seus divisores!");
		numerator = sc.nextInt();
		
		for(int i = 1; i <= numerator; i++) {
			if(numerator % i == 0) {
				System.out.printf("O número %d é divisível por %d%n", numerator, i);
			}
		}
		
		sc.close();

	}

}
