package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		//Listas não aceitam tipos primitivos. Use Wrapper class
		List<String> list = new ArrayList<>();
		
		//adicionar itens
		list.add("Maria");	
		list.add("Alex");	
		list.add("Bob");	
		list.add("Anna");
		//adiciona indereçável
		list.add(2, "Marco");
		
		//tamanho da lista
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		//Capaz de remover um dado a partir de uma informação ou posição na lista
		//list.remove("Anna");
		//list.remove(1);
		//Remover com predicado (lambda)
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		//Pegar index
		System.out.println("Index do Bob: " + list.indexOf("Bob"));
		//Se ele não achar, retorna '-1'
		System.out.println("Index do Marco: " + list.indexOf("Marco"));
		
		//Filtragem de lista
		System.out.println("----------------------");
		//Exibir a lista apenas com os que tenham nome com 'A'.
		//Converte para String -> passa a expressão desejada (lambda -> coleta os dados
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		//Pegar o primeiro nome com a letra 'J'.
		//Converte para String -> passa a expressão desejada (lambda) -> filtra caso existente, se não, retorna nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
