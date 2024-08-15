package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/* Faça um programa para ler dois vetores 
		 * A e B, contendo N elementos cada. Em 
		 * seguida, gere um terceiro vetor C onde 
		 * cada elemento de C é a soma dos elementos 
		 * correspondentes de A e B. Imprima o vetor 
		 * C gerado.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de valores que cada vetor terá: ");
		int n = sc.nextInt();
		int[] vect1 = new int[n];
		int[] vect2 = new int[n];
		
		System.out.println("\nDigite os valores do 1° vetor: ");
		for(int i = 0; i < vect1.length; i++) {
			System.out.printf("%d° numero do 1° vetor = ", i+1);
			vect1[i] = sc.nextInt();
		}
		
		System.out.println("\nDigite os valores do 2° vetor: ");
		for(int i = 0; i < vect2.length; i++) {
			System.out.printf("%d° numero do 2° vetor = ", i+1);
			vect2[i] = sc.nextInt();
		}
		
		System.out.println("\nResultado da soma dos vetores:");
		for(int i = 0; i < n; i++) {
			System.out.printf("Soma dos números na posição %d = %d.%n", i+1, vect1[i] + vect2[i]);
		}
		sc.close();

	}

}
