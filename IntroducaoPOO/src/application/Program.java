package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		// Programa sem POO
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os lados do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os lados do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double xArea = x.area();
		double yArea = y.area();
		
		System.out.printf("Área do triangulo X: %.4f%n", xArea);
		System.out.printf("Área do triangulo Y: %.4f%n", yArea);
		
		if ( xArea > yArea) {
			System.out.println("A maior área é a área do triângulo X.");
		}
		else {
			System.out.println("A maior área é a área do triângulo Y.");
		}
		
		sc.close();

	}

}
