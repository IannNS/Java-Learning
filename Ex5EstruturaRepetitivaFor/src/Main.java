import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Ler um valor N. Calcular e escrever seu respectivo fatorial. 
		 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.Lembrando 
		 * que, por definição, fatorial de 0 é 1.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int typedNumber, factorial = 1;
		
		System.out.println("Olá! Digite o número que deseja calcular o fatorial: ");
		typedNumber = sc.nextInt();
		
		//Lógica descrita (pra eu não esquecer depois)
		/*
		 * O valor do fatorial inicial em 1, assim, quando calcularmos o fatorial de 0 ou 1, ele sempre dará 1.
		 * No início do loop, o increment i tem valor igual ao número digitado;
		 * Enquanto ele for maior que 0, ele efetua o código;
		 * ao fim do loop, subtrai 1 do valor do incremento;
		 * 
		 * no loop, o valor do fatorial é multiplicado pelo valor do incremento.
		 * Exemplo:
		 * 
		 * (no início do loop)
		 * n = 4;
		 * fatorial = fatorial * incremento, ou seja:
		 * 1 *= 4;
		 * depois, 
		 * 4 *= 3;
		 * depois, 
		 * 12 *= 2;
		 * ...
		 * 
		 */
		
		for (int i = typedNumber; i > 0; i--) {
			factorial *= i;
		}
		
		System.out.printf("O fatorial de %d é = %d%n", typedNumber, factorial);
		
		sc.close();
	}

}
