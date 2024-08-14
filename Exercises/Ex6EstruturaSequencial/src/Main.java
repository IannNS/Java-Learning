import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa que leia três valores com ponto flutuante de 
		 * dupla precisão: A, B e C. Em seguida, calcule e mostre:
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, area, pi;
		pi = 3.14159;
		
		System.out.println("Olá! Digite o valor de A para calcularmos as áreas.");
		A = sc.nextDouble();
		System.out.println("Olá! Digite o valor de B para calcularmos as áreas.");
		B = sc.nextDouble();
		System.out.println("Olá! Digite o valor de C para calcularmos as áreas.");
		C = sc.nextDouble();
		
		area = (A * C) / 2;
		System.out.printf("Área do Triângulo (tendo A como base e C como altura): %.3f%n", area);
		
		area = (pi * Math.pow(C, 2.0));
		System.out.printf("Área do Círculo (tendo C como raio): %.3f%n", area);
		
		area = ((A + B) * C) / 2;
		System.out.printf("Área do Trapézio (tendo A como base maior, B como base menor e C como altura): %.3f%n", area);
		
		area = Math.pow(B, 2.0);
		System.out.printf("Área do Quadrado (tendo B como lado): %.3f%n", area);
		
		area = (A * B);
		System.out.printf("Área do Retângulo (tendo A como base e B como altura): %.3f%n", area);
		
	}

}
