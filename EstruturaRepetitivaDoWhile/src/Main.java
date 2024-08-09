import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Exemplo da estrutura Do While
		/* Do While é menos utilizado
		 * Sua principal função é executar um comando e DEPOIS verificar a condição
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char response;
		double c, f;
		
		do {
			System.out.println("Digite uma temperatura em Celcius para fazermos a conversão em Fahrenheit: ");
			c = sc.nextDouble();
			
			f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Temperatura em Fahrenheit: %.1f°F%n", f);
			
			System.out.println("Deseja repetir (s/n)?");
			response = sc.next().charAt(0);	
		} while(response == 's');
		
		sc.close();
		
	}

}
