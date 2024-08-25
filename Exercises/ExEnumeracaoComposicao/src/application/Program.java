package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("DADOS DO CLIENTE:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.next();
		System.out.print("Data de nascimento (dd/MM/yyyy): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("DADOS DO PEDIDO:");
		System.out.print("Qual o status do pedido? ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("Quantos itens deseja adicionar ao pedido? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite os dados do item #"+ i+1 +":");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Preço do produto: R$");
			Double productPrice = sc.nextDouble();
			System.out.println("Quantidade de produtos: ");
			Integer productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			
			order.addItems(orderItem);
		}
		
		System.out.println(order);
		
		sc.close();
	}

}
