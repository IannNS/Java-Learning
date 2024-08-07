import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Leia um valor com duas casas decimais, equivalente ao 
		 * salário de uma pessoa de Lisarb. Em seguida, calcule e
		 * mostre o valor que esta pessoa deve pagar de Imposto de 
		 * Renda, segundo a tabelaLembre que, se o salário for 
		 * R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, 
		 * pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é 
		 * isenta de Imposto de Renda. No exemplo fornecido, a taxa é
		 * de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em 
		 * R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary, tributed;
		
		System.out.println("Bem-vindo à Receita Federal de Lisab! Digite o seu salário em Rombus para fazermos o cálculo da sua tributação:");
		salary = sc.nextDouble();
		
		if(salary <= 2000.00) {
			System.out.printf("Seu salário de %.2f é isento de tributação!%n", salary);
		}
		else if (salary <= 3000.00) {
			tributed = (salary - 2000.00) * 0.08;
			System.out.printf("Seu salário de %.2f possui tributação de %.2f!%n", salary, tributed);
		}
		else if(salary <= 4500.00) {
			tributed = (salary - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("Seu salário de %.2f possui tributação de %.2f!%n", salary, tributed);
		}
		else if(salary > 4500.00) {
			tributed = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("Seu salário de %.2f possui tributação de %.2f!%n", salary, tributed);
		}
		
		sc.close();
	}

}
