package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler um conjunto 
		 * de N nomes de alunos, bem como as notas 
		 * que eles tiraram no 1º e 2º semestres. 
		 * Cada uma dessas informações deve ser 
		 * armazenada em um vetor. Depois, imprimir 
		 * os nomes dos alunos aprovados, considerando 
		 * aprovados aqueles cuja média das notas 
		 * seja maior ou igual a 6.0 (seis)
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de alunos que iremos inserir no sistema: ");
		int n = sc.nextInt();
		String[] names = new String[n];
		double[] firstGrades = new double[n];
		double[] secondGrades = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%nDigite o nome, primeira e segunda nota do %d°(a) aluno: %n", i+1);
			sc.nextLine();
			names[i] = sc.nextLine();
			firstGrades[i] = sc.nextDouble();
			secondGrades[i] = sc.nextDouble();
			
			Person person = new Person(names[i], firstGrades[i], secondGrades[i]);
		}
		
		System.out.println("\nAlunos aprovados (acima da média 6.0): ");
		for(int i = 0; i < n; i++) {
			if((firstGrades[i] + secondGrades[i]) / 2.0 >= 6.0) {
				System.out.printf("%s%n", names[i]);
			}
		}
		
		sc.close();

	}

}
