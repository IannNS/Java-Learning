import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Teste do modo Debug 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y = 0;
		
		System.out.println("Olá! Digite um valor inteiro: ");
		x = sc.nextInt();
		
		y += x;
		System.out.println("Seu valor digitado é: " +y);
		
		sc.close();
	}

}
