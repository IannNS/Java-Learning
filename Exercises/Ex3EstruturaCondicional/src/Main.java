import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Leia 2 valores inteiros (A e B). Após, o programa deve 
		 * mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
		 * indicando se os valores lidos são múltiplos entre si. 
		 * Atenção: os números devem poder ser digitados em 
		 * ordem crescente ou decrescente.
		 */
		
		Scanner sc = new Scanner(System.in);
		int inputA, inputB;
		
		System.out.println("Olá! Digite o primeiro valor para verificar se é múltiplo: ");
		inputA = sc.nextInt();
		
		System.out.println("Olá! Digite o segundo valor para verificar se é múltiplo: ");
		inputB = sc.nextInt();
		
		if(inputA > inputB) {
			if(inputA % inputB == 0) {
				System.out.println("São múltiplos!");
			}
			
			else {
				System.out.println("Não são múltiplos!");
			}
		}
		else {
			if(inputB % inputA == 0) {
				System.out.println("São múltiplos!");
			}
			else {
				System.out.println("Não são múltiplos!");
			}
		}
		
		sc.close();
	}
}
