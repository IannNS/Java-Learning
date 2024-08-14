import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		 * A seguir, calcule e mostre a diferença do produto
		 * de A e B pelo produto de C e D segundo a fórmula: 
		 * DIFERENCA = (A * B - C * D)
		*/
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, result;
		
		System.out.println("Olá! Digite o valor de A para fazermos o cálculo desejado!");
		A = sc.nextInt();
		System.out.println("Olá! Digite o valor de B para fazermos o cálculo desejado!");
		B = sc.nextInt();
		System.out.println("Olá! Digite o valor de C para fazermos o cálculo desejado!");
		C = sc.nextInt();
		System.out.println("Olá! Digite o valor de D para fazermos o cálculo desejado!");
		D = sc.nextInt();
		
		result = (A * B) - (C * D);
		System.out.println("DIFERENÇA: " + result);
		sc.close();
	}

}
