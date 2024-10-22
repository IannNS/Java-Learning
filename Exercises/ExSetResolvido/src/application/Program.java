package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo de entrada: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				// Para passar a data de um br (e praticamente qualquer outra instancia) para um variável do tipo Date:
				// ... Date.from(instant.parse(...));
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntry(username,moment));
				
				line = br.readLine();
				
			}
			System.out.println("Total de usuários logados: " + set.size());
		} catch (IOException e){
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
	}

}
