import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Leia um valor inteiro X (1 <= X <= 1000). 
		 * Em seguida mostre os ímpares de 1 até X, 
		 * um valor por linha, inclusive o X, se 
		 * for o caso.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int inNum;
		
		System.out.println("Olá! Digite um valor maior que 1 para exibirmos os ímpares até ele.");
		inNum = sc.nextInt();
		
		for(int i = 1; i <= inNum; i += 2) {
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
