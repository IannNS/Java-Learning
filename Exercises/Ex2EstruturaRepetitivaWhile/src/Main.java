import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Escreva um programa para ler as coordenadas (X,Y) 
		 * de uma quantidade indeterminada de pontos no sistema
		 * cartesiano. Para cada ponto escrever o quadrante a 
		 * que ele pertence. O algoritmo será encerrado quando 
		 * pelo menos uma de duas coordenadas for NULA 
		 * (nesta situação sem escrever mensagem alguma)
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Olá! Digite o valor de X no plano cartesiano: ");
		x = sc.nextInt();
		
		System.out.println("Agora, digite o valor de Y no plano cartesiano: ");
		y = sc.nextInt();
		
		while (x != 0 || y != 0) {
			//Q1
			if (x > 0 && y > 0) {
				System.out.println("O ponto está no Q1 do plano cartesiano!");
			}
			//Q2
			else if (x < 0 && y > 0) {
				System.out.println("O ponto está no Q2 do plano cartesiano!");
			}
			//Q3
			else if (x < 0 && y < 0) {
				System.out.println("O ponto está no Q3 do plano cartesiano!");
			}
			//Q4
			else{
				System.out.println("O ponto está no Q4 do plano cartesiano!");
			}
			
			System.out.println("Digite o valor de X no plano cartesiano: ");
			x = sc.nextInt();
			
			System.out.println("Agora, digite o valor de Y no plano cartesiano: ");
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
