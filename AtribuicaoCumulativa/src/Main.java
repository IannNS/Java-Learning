import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Exemplo usando += (lembre-se que existe para todas as operações).
		// += | -= | *= | /= | %=
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double conta = 50.0;
		
		System.out.println("Olá! Digite o número de minutos para calcularmos a tarifa da sua ligação:");
		minutos = sc.nextInt();
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.00;
		}
		
		System.out.printf("Total a pagar: R$%.2f%n", conta);
		
		sc.close();
	}

}
