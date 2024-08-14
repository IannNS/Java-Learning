package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangule;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangule rectangule = new Rectangule();
		
		System.out.println("Digte a altura e a largura do retângulo: ");
		rectangule.height = sc.nextDouble();
		rectangule.width = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", rectangule.area());
		System.out.printf("Perimetro: %.2f%n", rectangule.perimeter());
		System.out.printf("Diagonal: %.2f%¨n", rectangule.diagonal());
		
		sc.close();
		
	}

}
