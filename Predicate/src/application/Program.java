package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Usando um objeto com valor parametrizado 
		// você pode usar uma variavel para atribuir um valor no parametro!
		// Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		
		// removeIf recebe um predicado como argumento
		list.removeIf(new ProductPredicate());
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
