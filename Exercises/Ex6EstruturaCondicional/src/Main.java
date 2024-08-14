import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem 
		 * dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
		 * este valor se encontra. Obviamente se o valor não estiver em nenhum destes 
		 * intervalos, deverá ser impressa a mensagem “Fora de intervalo”
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double inputValue;
		
		System.out.println("Olá! Digite um valor que esteja dentro dos intervalos ([0,25], (25,50], (50,75], (75,100]) para organiza-los:");
		inputValue = sc.nextDouble();
		
		if(inputValue > 0 && inputValue <= 25) {
			System.out.printf("O número %.2f está no intervalo [0, 25]", inputValue);
		}
		else if (inputValue > 25 && inputValue <= 50) {
			System.out.printf("O número %.2f está no intervalo (25, 50]", inputValue);
		}
		else if (inputValue > 50 && inputValue <= 75) {
			System.out.printf("O número %.2f está no intervalo (50, 75]", inputValue);
		}
		else if (inputValue > 75 && inputValue <= 100) {
			System.out.printf("O número %.2f está no intervalo (75, 100]", inputValue);
		}
		else {
			System.out.printf("O número %.2f está fora dos intervalos disponíveis.", inputValue);
		}
		
		sc.close();

	}

}
