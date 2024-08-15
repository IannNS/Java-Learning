package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/* Faça um programa que leia N números inteiros 
		 * e armazene-os em um vetor. Em seguida, mostre 
		 * na tela todos os números pares, e também a 
		 * quantidade de números pares.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de loops que deseja fazer: ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		int sum = 0;
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o %d° número para verificarmos se ele é par: ", i+1);
			vect[i] += sc.nextInt();
			if(vect[i] % 2 == 0) {
				sum++;
			}
		}
		
		System.out.println("\nNúmeros pares: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
			}
		}
		
		System.out.printf("%nQuantidade de números pares: %d", sum);
		
		sc.close();

	}

}
