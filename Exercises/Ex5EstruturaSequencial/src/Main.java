import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1, o 
		 * número de peças 1, o valor unitário de cada peça 1, o
		 * código de uma peça 2, o número de peças 2 e o valor 
		 * unitário de cada peça 2. Calcule e mostre o valor a ser pago
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Item1Id, quant1, Item2Id, quant2;
		double val1, val2, payment;
		
		System.out.println("Olá! Digite o Id da primeira peça que deseja colocar no seu carrinho: ");
		Item1Id = sc.nextInt();
		
		System.out.println("Digite a quantidade de peças 1: ");
		quant1 = sc.nextInt();
		
		System.out.println("Digite o valor das peças 1: ");
		val1 = sc.nextDouble();
		
		System.out.println("Digite o Id da segunda peça que deseja colocar no seu carrinho: ");
		Item2Id = sc.nextInt();
		
		System.out.println("Digite a quantidade de peças 2: ");
		quant2 = sc.nextInt();
		
		System.out.println("Digite o valor das peças 2: ");
		val2 = sc.nextDouble();
		
		payment = (quant1 * val1) + (quant2 * val2);
		System.out.printf("Valor a pagar: R$%.2f", payment);
		sc.close();
	}

}
