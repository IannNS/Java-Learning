package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Quantos produtos deseja cadastrar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Dados do produto N°"+(i+1)+":");
			System.out.print("Produto comum, usando ou importado (c/u/i)? ");
			char typeProduct = sc.next().charAt(0);
			
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço do produto: R$");
			double price = sc.nextDouble();
			
			if(typeProduct == 'i') {
				System.out.print("Imposto: R$");
				double fee = sc.nextDouble();
				
				products.add(new ImportedProduct(name, price, fee));
			}
			else if(typeProduct == 'u') {
				System.out.print("Data de fabricação (dd/MM/yyyy): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				products.add(new UsedProduct(name, price, manufactureDate));
			}
			else {
				products.add(new Product(name, price));
			}
			
		}
		
		System.out.println("ETIQUETAS DOS PRODUTOS:");
		
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
