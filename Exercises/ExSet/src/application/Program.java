package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Student> set = new HashSet<>();

		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o número de pessoas no curso " +(i+1)+": ");
			int quantity = sc.nextInt();

			for (int j = 0; j < quantity; j++) {
				int code = sc.nextInt();
				Student student = new Student(code);

				set.add(student);
			}
		}
		
		System.out.println("Total de alunos matriculados: " + set.size());

		sc.close();

	}

}
