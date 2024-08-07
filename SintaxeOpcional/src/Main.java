import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Exemplo do comando Switch
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Olá! Digite o algorismo representante do dia da semana:");
		dia = sc.nextInt();
		
		switch(dia) {
			case 1:
				System.out.println("Seu dia da semana é: Segunda");
				break;
			
			case 2:
				System.out.println("Seu dia da semana é: Terça");
				break;
				
			case 3:
				System.out.println("Seu dia da semana é: Quarta");
				break;
				
			case 4:
				System.out.println("Seu dia da semana é: Quinta");
				break;
				
			case 5:
				System.out.println("Seu dia da semana é: Sexta");
				break;
			
			case 6:
				System.out.println("Seu dia da semana é: Sábado");
				break;
				
			case 7:
				System.out.println("Seu dia da semana é: Domingo");
				break;
				
			default:
				System.out.println("Dia inválido!");
				break;
		}
		
		sc.close();
	}

}
