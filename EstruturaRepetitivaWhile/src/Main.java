import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Estrutura While
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int typedNum = 0;
		int soma = 0; 
		
		while (typedNum != 0) {
			System.out.println("Olá! Digite valores para somarmos até o valor digitado ser 0: ");
			typedNum = sc.nextInt();
			soma += typedNum;
		}
		
		System.out.println("Total: " + soma);
		
		sc.close();
	}

}
