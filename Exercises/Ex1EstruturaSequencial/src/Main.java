import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Faça um programa para ler dois valores inteiros, e 
		 * depois mostrar na tela a soma desses números com uma
		 * mensagem explicativa, conforme exemplos.
		*/
		
		Scanner sc = new Scanner(System.in);
		int userInput1, userInput2, sum;
		
		System.out.println("Olá! Digite o primeiro valor para fazer a soma: ");
		userInput1 = sc.nextInt();
		System.out.println("Olá! Digite o segundo valor para fazer a soma: ");
		userInput2 = sc.nextInt();
		
		sum = userInput1 + userInput2;
		
		System.out.println("Resultado da soma: " + sum);
		sc.close();
	}
}
