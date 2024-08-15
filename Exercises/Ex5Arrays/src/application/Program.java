package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/* Faça um programa que leia N números reais e 
		 * armazene-os em um vetor. Em seguida, mostrar 
		 * na tela o maior número do vetor (supor não 
		 * haver empates). Mostrar também a posição do 
		 * maior elemento, considerando a primeira posição 
		 * como 0 (zero).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o valor de números que deesja verificar: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			vect[i] = sc.nextDouble();
		}
		
		double higher = 0;
		int position = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] > higher) {
				position = i+1;
				higher = vect[i];
			}
		}

		System.out.printf("%nMaior valor digitado é: %.1f", higher);
		System.out.printf("%nPosição do maior valor: %d", position);
		
		sc.close();

	}

}
