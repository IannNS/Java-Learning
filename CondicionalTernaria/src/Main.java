import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Exemplo de Expressão Condicional Ternária.
		/*Estrutura:
		 * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, desconto;
		
		System.out.println("Olá! Digite o preço do produto que deseja comprar:");
		preco = sc.nextDouble();
		
		desconto = (preco < 20.0) ? preco * 0.01 :  preco * 0.05;
		
		System.out.printf("O valor do seu desconto é: %.1f", desconto);
		
		sc.close();
	}

}
