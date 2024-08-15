package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler um vetor de N 
		 * números inteiros. Em seguida, mostrar na 
		 * tela a média aritmética somente dos números 
		 * pares lidos, com uma casa decimal. Se nenhum 
		 * número par for digitado, mostrar a 
		 * mensagem "NENHUM NUMERO PAR"
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de loops que iremos executar para verificarmos a médias dos números pares: ");
		int n = sc.nextInt();
		int[] numbers = new int[n];
		
		int numberOfOdds = 0;
		double avg = 0.0;
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			numbers[i] = sc.nextInt();
			if(numbers[i] % 2 == 0) {
				avg += numbers[i];
				numberOfOdds++;
			}
		}
		
		if(numberOfOdds > 0) {
			System.out.printf("%nMédia dos números pares = %.1f.", avg/numberOfOdds);
		}
		else {
			System.out.println("%nNenhum número digitado é par. Não há média a ser calculada.");
		}
		
		sc.close();

	}

}
