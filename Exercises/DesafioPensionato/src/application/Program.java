package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];
		
		System.out.println("Olá! Digite o número de quartos que deseja alugar: ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			System.out.printf("Aluguel %d: ", i);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("E-mail: ");
			String email = sc.next();
			
			System.out.println("Quarto: ");
			int roomNumber = sc.nextInt();
			
			rooms[roomNumber] = new Rent(name, email);
		}
		
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.printf("%d : %s", i, rooms[i]);
			}
		}
		sc.close();

	}

}
