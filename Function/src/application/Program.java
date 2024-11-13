package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		
		// recebe um function como argumento
		// Aplica a função dentro do map para cada elemento na lista
		// map só funciona para Stream!
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		// Usando método estático
		// List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		// Usando método não-static
		// List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		// Usando expressão lâmbda declarada
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		names.forEach(System.out::println);
	}

}
