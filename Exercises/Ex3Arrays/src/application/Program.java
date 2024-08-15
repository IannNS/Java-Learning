package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler nome, idade e altura 
		 * de N pessoas, conforme exemplo. Depois, mostrar 
		 * na tela a altura média das pessoas, e mostrar 
		 * também a porcentagem de pessoas com menos de 16 
		 * anos, bem como os nomes dessas pessoas caso houver.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de pessoas que deseja cadastrar: ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("\nDados da %d°a pessoa: ", i+1);
			System.out.print("\nNome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			Person person = new Person(name, age, height);
			vect[i] = person;
		}
		
		double sumHeight = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sumHeight += (vect[i].getHeight());
		}
		
		int totalSixteen = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				totalSixteen++;
			}
		}
		
		System.out.printf("\nAltura média das pessoas no sistema: %.2fm%n", sumHeight/vect.length);
		System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%", (double)totalSixteen / vect.length * 100.0);
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.printf("A %d°a pessoa é menor de 16: %s, com %d ano(s) de idade.%n", i+1, vect[i].getName(), vect[i].getAge());
			}
		}
		
		sc.close();

	}

}
