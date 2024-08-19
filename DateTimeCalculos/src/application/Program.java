package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-08-19");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-19T16:40:26");
		Instant d06 = Instant.parse("2024-08-19T16:40:26Z");
		
		LocalDate pastWeek = d04.minusDays(7);
		LocalDate nextWeek = d04.plusDays(7);
		
		System.out.println("Last week: " +pastWeek);
		System.out.println("Next week: " +nextWeek);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("Last week LocalDateTime: " +pastWeekLocalDateTime);
		System.out.println("Next week LocalDateTime: " +nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Last week Instant: " +pastWeekInstant);
		System.out.println("Next week Instant: " +nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);

		System.out.println("Duração em dias (LocalDate): " +t1.toDays());
		System.out.println("Duração em dias (LocalDateTime): " +t2.toDays());
		System.out.println("Duração em dias (Instant): " +t3.toDays());
		
	}

}
