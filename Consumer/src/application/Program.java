package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// tal qual o predicate, pode-se atribuir um parâmetro para essa forma
		double factor = 1.1;
		Consumer<Product> cons = p -> { // pode-se abrir chaves para declarar uma expressão
			p.setPrice(p.getPrice() * factor);
		};
		
		list.forEach(cons);
		
		// Recebe um consumer como argumento. Executa função para cada elemento
		list.forEach(new PriceUpdate());
		
		// Pode-se chamar métodos, tal qual no Predicate
		list.forEach(Product::staticPriceUpdate);
		// Reference method do sysout
		list.forEach(System.out::println);
	}

}
