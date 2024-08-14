import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Um Posto de combustíveis deseja determinar qual 
		 * de seus produtos tem a preferência de seus clientes. 
		 * Escreva um algoritmo para ler o tipo de combustível 
		 * abastecido (codificado da seguinte forma: 1.Álcool 
		 * 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe 
		 * um código inválido (fora da faixa de 1 a 4) deve ser 
		 * solicitado um novo código (até que seja válido). O 
		 * programa será encerrado quando o código informado for 
		 * o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" 
		 * e a quantidade de clientes que abasteceram cada tipo 
		 * de combustível, conforme exemplo.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int typeFuel = 0, alcool = 0, gas = 0, diesel = 0;

		System.out.println("Digite o combustível desejado: \n\n1.Álcool\n2.Gasolina\n3.Diesel\n4.Fim\n\nItem desejado: ");
		
		while(typeFuel != 4) {
			
			if(typeFuel == 1) {
				alcool += 1;
			}
			else if(typeFuel == 2) {
				gas += 1;
			}
			else if(typeFuel == 3) {
				diesel += 1;
			}
			else {
				System.out.println("POR FAVOR, DIGITE UM VALOR DENTRO DA TABELA!");
			}
			
			typeFuel = sc.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO!%nRelatório finalizado: %n%n1.Álcool: %d%n2.Gasolina: %d%n3.Diesel: %d%n", alcool, gas, diesel);
		
		sc.close();
	}

}
