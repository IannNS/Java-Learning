import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Criação de métodos.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite 3 números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		showResult(higher);
		
		sc.close();
	}
	
	//Não precisa ser o mesmo nome de variável para os parâmetros
	public static int max(int x, int y, int z) {
		int aux;
		
		if(x > y && x > z) {
			aux = x;
		}
		else if(y > z) {	
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
