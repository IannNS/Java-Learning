import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Com base na tabela, escreva um programa que leia o 
		 * código de um item e a quantidade deste item. A seguir, 
		 * calcule e mostre o valor da conta a pagar.
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int itemId, itemQuantity;
		double value, payment;
		
		System.out.printf("Olá! Digite o código do item que deseja comprar!"
				+ "\n1 - Cachorro quente  R$4.00"
				+ "\n2 - X-Salada         R$4.50"
				+ "\n3 - X-Bacon          R$5.00"
				+ "\n4 - Torrada Simples  R$2.00"
				+ "\n5 - Refrigerante     R$1.00"
				+ "\n"
				+ "\nItem a ser pedido:"
				+ "\n");
		itemId = sc.nextInt();
		
		System.out.println("Digite a quantidade de itens que deseja:");
		itemQuantity = sc.nextInt();
		
		if(itemId == 1) {
			value = 4.00;
			payment = value * itemQuantity;
			System.out.printf("O valor total do seu pedido é: R$%.2f", payment);
		}
		else if (itemId == 2) {
			value = 4.50;
			payment = value * itemQuantity;
			System.out.printf("O valor total do seu pedido é: R$%.2f", payment);
			
		}
		else if (itemId == 3) {
			value = 5.00;
			payment = value * itemQuantity;
			System.out.printf("O valor total do seu pedido é: R$%.2f", payment);
			
		}
		else if (itemId == 4) {
			value = 2.00;
			payment = value * itemQuantity;
			System.out.printf("O valor total do seu pedido é: R$%.2f", payment);
			
		}
		else if (itemId == 5) {
			value = 1.00;
			payment = value * itemQuantity;
			System.out.printf("O valor total do seu pedido é: R$%.2f", payment);
			
		}
		else{
			System.out.println("Este item não está presenta na lista!");
		}
		
		sc.close();
	}

}
