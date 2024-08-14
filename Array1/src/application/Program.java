package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de loops que deseja fazer: ");
		int n = sc.nextInt();
		//vetor com 'n' elementos;
		double[] vect = new double[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite uma altura para fazermos a média: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg	= sum / n;
		System.out.printf("Altura média: %.2f"+avg);
		
		sc.close();
		

	}

}
