package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite os dados do aluno:");
		System.out.print("Nome: ");
		student.name = sc.nextLine();
		System.out.println("Notas: ");
		student.addGrade(sc.nextDouble()); 
		student.addGrade(sc.nextDouble()); 
		student.addGrade(sc.nextDouble()); 
		
		System.out.printf("Nota final: %.2f%n", student.grade);
		System.out.println(student.state());
		
		sc.close();
	}
}
