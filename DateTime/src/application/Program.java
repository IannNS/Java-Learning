package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		
		// Documentação do DateTimeFormatter: 
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-08-19");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-19T01:30:26");
		Instant d06 = Instant.parse("2024-08-19T01:30:26Z");
		
		Instant d07 = Instant.parse("2024-08-19T01:30:26-03:00");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		// Pode-se chamar o padrão de formatação dentro do argumento, ex:
		// LocalDate d08 = LocalDate.parse("19/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate d08 = LocalDate.parse("19/08/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("19/08/2024 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 8, 19);
		LocalDateTime d11 = LocalDateTime.of(2024, 8, 19, 1, 30);
		
		System.out.println("Data atual: " + d01);
		System.out.println("Data e hora atual: " + d02);
		System.out.println("Data e hora atual (GND): " + d03);
		System.out.println("\nData (parse): " + d04);
		//ao inverso funciona também
		System.out.println("Data (parse formatado previamente): " + d04.format(fmt1));
		System.out.println("Dia (parse): " + d04.getDayOfMonth());
		System.out.println("Mês (parse): " + d04.getMonthValue());
		System.out.println("Ano (parse): " + d04.getYear());
		System.out.println("Data e hora (parse): " + d05);
		System.out.println("Hora (parse): " + d05.getHour());
		System.out.println("Minutos (parse): " + d05.getMinute());
		System.out.println("Data e hora (ISO): " + d05.format(fmt4));
		System.out.println("Data e hora GND (parse): " + d06);
		System.out.println("Data e hora GND (parse fromatado previamente): " + fmt3.format(d06));
		System.out.println("Data e hora GND (ISO): " + fmt5.format(d06));
		System.out.println("\nInstante formatado no time zone do dispositivo: " + r1);
		System.out.println("Instante formatado no time zone de Portugal: " + r2);
		System.out.println("Instante formatado no time zone do dispositivo (hora e dia): " + r3);
		System.out.println("Instante formatado no time zone de Portugal (hora e dia): " + r4);
		System.out.println("\nData e hora ZULU (parse): " + d07);
		System.out.println("Data (parse fomatado): " + d08);
		// Para conseguir os zone Ids de outras regiões, crie um for (String s : ZoneId.getAvailableZoneIds());
		System.out.println("Data e hora (parse fomatado): " + d09);
		System.out.println("Data e hora (parse fomatado previamente): " + d09.format(fmt2));
		System.out.println("Data de: " + d10);
		System.out.println("Data e hora de: " + d11);
	}
}
