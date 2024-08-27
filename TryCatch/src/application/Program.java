package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

	}
	
	public static void method1() {
		System.out.println("***COMEÇO MET1***");
		method2();
		System.out.println("***FIM MET1***");
	}
	
	public static void method2() {
		
		System.out.println("***COMEÇO MET2***");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Código a ser tratado
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		// Código caso não haja condição no 'try'
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			
			// Mostra o erro no terminal com o caminho da exceção
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("Erro de dado digitado!");
		}
		
		System.out.println("Fim do programa");
		
		sc.close();
		System.out.println("***FIM MET2***");
		
	}

}
