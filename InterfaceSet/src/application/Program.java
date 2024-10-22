package application;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		// Set é um conjunto não-ordenado e sem repetição!
		
		// Quando a ordem não importa, usa-se o HashSet, por ser o mais rápido.
		// Caso importe, use o TreeSet (caso Comparator) ou o linkedHashSet(Intermediário e ordenado com base na inserção). 
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		//Predicado em Lambda
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//união
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersecção
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//diferença
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		
		System.out.println(e);
	}

}
