package application;

public class Program {

	public static void main(String[] args) {
		
		//Wrapper classes tem a responsabilidade de tratar os tipos primitivos de forma transparente para o compilador;
		//Wrapper sempre salva dados com valor 'null' caso não haja inserção;
		//Usa-se, normalmente, para sistemas com tratamento de dados;
		
		int x = 20;
		
		Integer obj = x;
		
		System.out.println(obj);
		
		int y = obj;
		
		System.out.println(y);
	}

}
