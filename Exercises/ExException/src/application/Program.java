package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		//Método muito ruim!
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Número do quarto: ");
		int number = sc.nextInt();
		
		System.out.print("Digite a data do check in (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Digite a data do check out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: A data de check out é antes da data de check in!");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reserva: "+reservation);
			
			System.out.println("\nAtualizar dados de reserva: ");
			System.out.print("Digite a data do check in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Digite a data do check out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Erro na reserva: As datas devem ser futuras à data atual!");
			}
			else if(!checkOut.after(checkIn)){
				System.out.println("Erro na reserva: A data de check out é antes da data de check in!");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reserva: "+reservation);
			}
		}
		
		
		
		sc.close();
		
	}
}
