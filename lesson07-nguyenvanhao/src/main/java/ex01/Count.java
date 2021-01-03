package ex01;

import java.time.LocalDate;
import java.util.Locale;

public class Count {
	public static void main(String[] args) {
		getAllSundayinYear(2020);
	}
	private static void getAllSundayinYear(int year) {
		LocalDate start=LocalDate.of(year, 1, 1);
		start=start.plusDays(7-start.getDayOfWeek().getValue());
		LocalDate end=LocalDate.of(year,12,31);
		end=end.minusDays(end.getDayOfWeek().getValue());
		while(start.equals(end)!=true) {
			System.out.println(start);
			start=start.plusDays(7);
		}
		getLastSunday(year);
	}
	private static void getLastSunday(int year) {
		LocalDate end=LocalDate.of(year,12,31);
		end=end.minusDays(end.getDayOfWeek().getValue());
		System.out.println(end);
	}
}
