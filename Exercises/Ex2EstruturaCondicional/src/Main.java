import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		Scanner sc = new Scanner(System.in);
		int userInput;
		
		System.out.println("Olá! Digite um número para verificarmos se ele é par ou ímpar:");
		userInput = sc.nextInt();
		
		if(userInput % 2 == 0) {
			System.out.println("Seu número é par!");
		}
		
		else {
			System.out.println("Seu número é ímpar!");
		}
		
		sc.close();
	}

}
