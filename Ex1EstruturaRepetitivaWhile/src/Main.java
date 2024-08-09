import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Escreva um programa que repita a leitura de uma 
		 * senha até que ela seja válida. Para cada leitura 
		 * de senha incorreta informada, escrever a mensagem 
		 * "Senha Invalida". Quando a senha for informada 
		 * corretamente deve ser impressa a mensagem "Acesso 
		 * Permitido" e o algoritmo encerrado. Considere que 
		 * a senha correta é o valor 2002
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int password = 2002, typedPassword;
		
		System.out.println("Olá! Digite a senha para fazer o login: ");
		typedPassword = sc.nextInt();
		
		while(typedPassword != password) {
			System.out.println("SENHA INCORRETA, Digite a senha correta para fazer o login: ");
			typedPassword = sc.nextInt();
		}
		
		System.out.println("SENHA CORRETA, login efetuado :) ");
		
		sc.close();
	}

}
