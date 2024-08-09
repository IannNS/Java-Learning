import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Leia um valor inteiro N. Este valor será 
		 * a quantidade de valores inteiros X que 
		 * serão lidos em seguida. Mostre quantos 
		 * destes valores X estão dentro do intervalo [10,20] 
		 * e quantos estão fora do intervalo, mostrando
		 * essas informações conforme exemplo (use a palavra 
		 * "in" para dentro do intervalo, e "out" para 
		 * fora do intervalo).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cicle, typedNum = 0, totalIn = 0, totalOut = 0;
		
		System.out.println("Olá! Digite o número de ciclos que deseja realizar: ");
		cicle = sc.nextInt();
		
		for(int i = 0; i < cicle; i++) {
			System.out.println("Digite o número que deseja verificar se está dentro do intervalo [10,20]: ");
			typedNum = sc.nextInt();
			
			if(typedNum >= 10 && typedNum <= 20) {
				totalIn += 1;
			}
			else {
				totalOut += 1;
			}
		}
		
		System.out.printf("Total de números In: %d%nTotal de números Out:%d", totalIn, totalOut);
		
		sc.close();
	}

}
