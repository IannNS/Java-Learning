package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@email.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		cookies.put("phone", "99711133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("phone number: " + cookies.get("phone"));
		// Quando não existe, ele devolve null
		System.out.println("email: " + cookies.get("email"));
		System.out.println("size: " + cookies.size());
		
		System.out.println("Todos os cookies: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": "+ cookies.get(key));
		}
		
	}

}
