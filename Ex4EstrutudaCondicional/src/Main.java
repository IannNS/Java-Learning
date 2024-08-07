import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a duração do jogo, sabendo que 
		 * o mesmo pode começar em um dia e terminar em 
		 * outro, tendo uma duração mínima de 1 hora e máxima 
		 * de 24 horas
		 */
		
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, gameTime;
		
		System.out.println("Olá! Digite a hora inicial do jogo!");
		horaInicial = sc.nextInt();
		
		System.out.println("Olá! Digite a hora final do jogo!");
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			gameTime = horaFinal - horaInicial;
		}
		else {
			gameTime =  24 - (horaInicial + horaFinal);
		}
		
		if(gameTime < 0) {
			System.out.println("Esse jogo teve duração menor que 1 hora!");
		}
		else if (gameTime > 24) {
			System.out.println("Esse jogo teve duração maior que 24 horas!");
		}
		else {
			System.out.printf("Esse jogo teve duração de %d hora(s)", gameTime);
		}
		
		sc.close();
	}

}
