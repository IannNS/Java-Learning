package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler um conjunto de 
		 * nomes de pessoas e suas respectivas idades. 
		 * Os nomes devem ser armazenados em um vetor, 
		 * e as idades em um outro vetor. Depois, 
		 * mostrar na tela o nome da pessoa mais velha
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de pessoas que você deseja inserir no sistema: ");
		int n = sc.nextInt();
		String[] names = new String[n];
		int[] ages = new int[n];
		
		int olderAge = 0;
		String olderPerson = "";
		for(int i = 0; i < n; i++) {
			System.out.printf("%nDigite o nome e a idade da %d°a pessoa, em sequência: %n", i+1);
			sc.nextLine();
			names[i] = sc.nextLine();
			ages[i] = sc.nextInt();
			
			Person person = new Person(names[i], ages[i]);
			if(person.getAge() > olderAge) {
				olderAge = person.getAge();
				olderPerson = person.getName();
			}
		}
		
		System.out.printf("A pessoa mais velha presente no sistema é: %s, com %d ano(s)", olderPerson, olderAge);
		
		sc.close();

	}

}
