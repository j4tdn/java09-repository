package bt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class BT1 {
	public static void main(String[] args) {
		getAllSundaysInYear2(2020);
		getLastSundayInYear2(2020);
	}
	
	private static void getAllSundaysInYear1(int year) {
		Calendar start = Calendar.getInstance();
		start.set(year, 0, 1);
		Calendar end = Calendar.getInstance();
		end.set(year, 11, 31);
		
		String pattern = "dd/MM/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
		while (start.get(Calendar.DAY_OF_WEEK) != 1) {	
			start.add(Calendar.DAY_OF_YEAR, 1);
		}
		System.out.println("Sundays in " + year);
		Date date = start.getTime();
		while (start.before(end)) {
			System.out.println(df.format(date));
			start.add(Calendar.DAY_OF_YEAR, 7);
			date = start.getTime();
		}
	}
	
	private static void getLastSundayInYear1(int year) {
		Calendar end = Calendar.getInstance();
		end.set(year, 11, 25);
		String pattern = "dd/MM/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
		while (end.get(Calendar.DAY_OF_WEEK) !=1) {
			end.add(Calendar.DAY_OF_YEAR, 1);
		}
		Date date = end.getTime();
		System.out.println("Last Sunday in " + year);
		System.out.println(df.format(date));
	}
	
	private static void getAllSundaysInYear2(int year) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate start = LocalDate.of(year, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(year, Month.DECEMBER, 31);
		while (true) {
			if (start.getDayOfWeek().equals(DayOfWeek.SUNDAY)) break;
			start = start.plusDays(1);
		}
		System.out.println("Sundays in year:");
		while (start.isBefore(end)) {
			System.out.println(formatter.format(start));
			start = start.plusDays(7);
		}
	}
	
	private static void getLastSundayInYear2(int year) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate end = LocalDate.of(year, Month.DECEMBER, 31);
		while (end.getDayOfWeek() != DayOfWeek.SUNDAY) {
			end = end.minusDays(1);
		}
		System.out.println("Last sunday in year:");
		System.out.println((formatter.format(end)));
	}
}
