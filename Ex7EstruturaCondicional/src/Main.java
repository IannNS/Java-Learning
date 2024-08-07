import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar 
		 * as coordenadasde um ponto em um plano. A seguir, determine qual o 
		 * quadrante ao qual pertence o ponto, ou se está sobre um dos eixos 
		 * cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, 
		 * escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos 
		 * escreva “Eixo X” ou “Eixo Y”, conforme for asituação.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Olá! Digite o valor de X no plano cartesiano: ");
		x = sc.nextDouble();
		
		System.out.println("Digite o valor de Y no plano cartesiano:");
		y = sc.nextDouble();
		
		//Q1
		if(x > 0 && y > 0) {
			System.out.println("O ponto está no Quadrante 1.");
		}
		//Q2
		else if(x < 0 && y > 0) {
			System.out.println("O ponto está no Quadrante 2.");
		}
		//Q3
		else if(x < 0 && y < 0) {
			System.out.println("O ponto está no Quadrante 3.");
		}
		//Q4
		else if(x > 0 && y < 0) {
			System.out.println("O ponto está no Quadrante 4.");
		}
		//Eixo Y
		else if (x == 0 && y != 0){
			System.out.println("O ponto está no eixo Y");
		}
		//Eixo X
		else if (x != 0 && y == 0){
			System.out.println("O ponto está no eixo X");
		}
		//Origem
		else{
			System.out.println("O ponto está na origem O.");
		}
		
		sc.close();
	}

}
