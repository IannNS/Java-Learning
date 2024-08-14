import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		
		Scanner sc = new Scanner(System.in);
		int userInput;
		
		System.out.println("Olá! Digite um número para validação: ");
		userInput = sc.nextInt();
		
		if(userInput < 0) {
			System.out.println("O número digitado é negativo.");
		}
		
		else {
			System.out.println("O número digitado é positivo.");
		}
		
		sc.close();
	}

}
