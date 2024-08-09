import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Exemplo da estrutura repetitiva for
		 * 
		 * Estrutura:
		 * 
		 * for (inicio; condição; incremento){
		 * 	
		 * }
		 * 
		 * inicio: executado apenas no início do laço;
		 * condição: executado a cada loop, caso verdadeiro;
		 * incremento: executa a cada fim de loop;
		 * 
		 * Usa-se for quando sabe-se o número de 
		 * voltas (loops) que o sistema deve fazer!
		 * 
		 * Lembre-se de que o for inicia o loop no 
		 * valor da variável de incremento!
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int loopNumber, totalTo, soma = 0;
		
		System.out.println("Olá! Digite o número de vezes que deseja fazer a soma");
		loopNumber = sc.nextInt();
		
		for(int i = 0; i < loopNumber; i++) {
			System.out.println("Digite o número que deseja somar: ");
			totalTo = sc.nextInt();
			soma += totalTo;
		}
		
		System.out.printf("Soma total depois de %d loops = %d", loopNumber, soma);
		
		sc.close();

	}

}
