package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/* Faça um programa que leia um número inteiro 
		 * positivo N (máximo = 10) e depois N números 
		 * inteiros e armazene-os em um vetor. Em seguida, 
		 * mostrar na tela todos os números negativos lidos.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de loops que deseja executar (menor que 10): ");
		int n = sc.nextInt();
		
		while (n <= 0 || n > 10) {
			System.out.println("Por favor, digite um número de loops maior que 0 e menor que 10: ");
			n = sc.nextInt();
		}
		
		int[] vect =  new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos digitados: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
