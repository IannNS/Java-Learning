package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "Maria@email.com");	
		Client c2 = new Client("Maria", "Maria@email.com");	  
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		// Por não gaver memória em Stack, ele compara e confirma que 
		// são dados iguais, por serem tratados de forma diferente
		System.out.println(s1 == s2);
	}

}
