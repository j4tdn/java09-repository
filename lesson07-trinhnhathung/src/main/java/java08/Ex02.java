package java08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020, 9, 13, 3, 0, 0);
		LocalDateTime end = LocalDateTime.of(2020, 10, 12, 2, 0, 0);
		calculateRelationTime(start, end);
	}
	
	private static void calculateRelationTime (LocalDateTime start, LocalDateTime end) {
		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();
		
		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if (timeEnd.isBefore(timeStart)) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				period = period.minusMonths(1);
				
				int previousMonth = dateEnd.getMonthValue() -1;
				int year = dateEnd.getYear();
				int days = YearMonth.of(year, previousMonth).lengthOfMonth() -1;
				period = period.withDays(days);
				if (period.getMonths() < 0 ) {
					period = period.minusYears(1);
					period = period.withMonths(11);
				} 
			}
			duration = duration.plusDays(1);
		}
		
		long years = period.getYears();
		long months = period.getMonths();
		long days = period.getDays();
		
		long durations = duration.getSeconds();
		long hours = TimeUnit.SECONDS.toHours(durations);

		duration = duration.minusHours(hours);
		long minutes = duration.toMinutes();

		long seconds = duration.minusMinutes(minutes).toSeconds();
		System.out.println(years +" years " + months +" months " + days +" days " + hours +" hours "+ minutes +" minutes " + seconds +" seconds ");
	}
}
