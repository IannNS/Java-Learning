package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler um número inteiro N 
		 * e depois um vetor de N números reais. Em seguida,
		 * mostrar na tela a média aritmética de todos 
		 * elementos com três casas decimais. Depois mostrar 
		 * todos os elementos do vetor que estejam abaixo da 
		 * média, com uma casa decimal cada.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de notas para fazermos a média: ");
		int n = sc.nextInt();
		double[] grade = new double[n];
		
		double avg = 0.0;
		for(int i = 0; i < grade.length; i++) {
			System.out.printf("Digite a %d° bota: ", i+1);
			grade[i] = sc.nextDouble();
			avg += grade[i];
		}
		
		
		System.out.printf("%nMédia das notas presentes no vetor = %.3f.", avg/grade.length);
		System.out.println("%nNotas abaixo da média: ");
		for(int i = 0; i < grade.length; i++) {
			if(grade[i] < avg/grade.length) {
				System.out.printf("%d° nota, %.1f%n", i+1, grade[i]);
			}
		}
		sc.close();

	}

}
