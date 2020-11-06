package java08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	public static void main(String[] args) {
		getAllSundayInYear(2020);
		System.out.println("=======================");
		getLastSunday(2020);
	}
	
	private static void getAllSundayInYear (int year) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate startYear = LocalDate.of(year,1 ,1);
		int firstSunday = 8 - startYear.getDayOfWeek().getValue();
		startYear = startYear.withDayOfMonth(firstSunday);
		LocalDate endYear = LocalDate.of (year,12,31);
		do {
			System.out.println(formatter.format(startYear));
			startYear = startYear.plusDays(7);
		} while (startYear.isBefore(endYear));
	}
	
	private static void getLastSunday (int year) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate endYear = LocalDate.of(year, 12, 31);
		int lastSunday = endYear.getDayOfMonth() - endYear.getDayOfWeek().getValue();
		endYear = endYear.withDayOfMonth(lastSunday);
		System.out.println(formatter.format(endYear));
	}
}
