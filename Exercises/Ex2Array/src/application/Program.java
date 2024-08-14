package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de loops que deseja executar: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		System.out.print("\nNúmeros digitados: ");
		for(int i = 0; i < vect.length; i++) {
			System.out.print(" "+vect[i]+" ");
		}
		System.out.printf("%nSoma dos números: %.2f%n", sum);
		System.out.printf("%nMédia dos números: %.2f%n", avg);
		
		sc.close();

	}

}
