package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		/*	Tem-se um conjunto de dados contendo a altura 
		 * e o gênero (M, F) de N pessoas. Fazer um programa
		 * que calcule e escreva a maior e a menor altura do 
		 * grupo, a média de altura das mulheres, e o número
		 * de homens.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Quantas pessoas iremos inserir no sistema: ");
		int n = sc.nextInt();
		double[] heights = new double[n];
		char[] genders = new char[n];
		
		double sumWomanHeight = 0.0;
		int numberW = 0;
		int numberM = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da %d°a pessoa: ", i+1);
			heights[i] = sc.nextDouble();
			System.out.printf("Sexo da %d°a pessoa>: ", i+1);
			genders[i] = sc.next().charAt(0);
			
			if(genders[i] == 'M') {
				numberM++;
			}
			
			if(genders[i] == 'F') {
				numberW++;
				sumWomanHeight += heights[i];
			}
			
			Person person = new Person(heights[i], genders[i]);
		}
		
		double smaller = heights[0];
		double bigger = heights[0];
		
		for(int i = 0; i < n; i++) {

			if(heights[i] > bigger) {
				bigger = heights[i];
			}
			
			if(heights[i] < smaller) {
				smaller = heights[i];
			}
		}
		
		System.out.printf("Maior altura no sistema = %.2f%n", bigger);
		System.out.printf("Menor altura no sistema = %.2f%n", smaller);
		System.out.printf("Média da altura das mulhers = %.2f%n", sumWomanHeight/numberW);
		System.out.printf("Número de homens no sistema = %d%n", numberM);
		
		sc.close();

	}

}
