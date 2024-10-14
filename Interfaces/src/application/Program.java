package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Digite os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Hora da retirada: ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Hora do retorno: ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
			
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Digite o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Digite o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: R$" + String.format("%.2f", cr.getInvoce().getBasicPayment()));
		System.out.println("Imposto: R$" + String.format("%.2f",cr.getInvoce().getTax()));
		System.out.println("Pagamento total: R$" + String.format("%.2f",cr.getInvoce().getTotalPayment()));
		
		sc.close();

	}

}
