import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*Faça um programa para ler o valor do raio de um círculo, e 
		 * depois mostrar o valor da área deste círculo com quatro
		 * casas decimais conforme exemplos. 
		 * 
		 * Fórmula da área: area = π . raio2
		 * Considere o valor de π = 3.14159
		*/
		
		Scanner sc = new Scanner(System.in);
		double radius, pi, area;
		pi = 3.14159;
		
		System.out.println("Bem vindo ao cáculo da área de círculas! \nDigite o valor do raio do círculo que deseja fazer o cálculo:");
		radius = sc.nextDouble();
		
		area = pi * Math.pow(radius, 2.0);
		
		System.out.printf("A área do círculo calcúlado é: %.4f%n", area);
		sc.close();
	}

}
