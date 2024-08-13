package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dólar: ");
		double value = sc.nextDouble();
		
		System.out.println("Digite a quantidade de dólares que deseja comprar: ");
		double amount = sc.nextDouble();
		
		System.out.printf("Total a ser pago em reais = R$%.2f%n", CurrencyConverter.converteToDollar(value, amount));
		
		sc.close();

	}

}
