package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Digite os dados do produto:");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade: ");
		product.quantity = sc.nextInt();
		
		//Na chamada do objeto como String, o sistema interpreta automaticamente que deve-se utilizar a função do toString.
		System.out.println("Dados do produto: "+ product);
		
		System.out.println();
		
		System.out.println("Coloque o número de produtos que deseja adicionar no estoque: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println("Dados atualizados do produto: "+ product);
		
		System.out.println("Coloque o número de produtos que deseja adicionar no estoque: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println("Dados atualizados do produto: "+ product);
		
		sc.close();
	}

}
