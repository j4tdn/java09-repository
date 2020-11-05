package exercises.java08;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Ex01 {
	
	public static void main(String[] args) {
		ArrayList<LocalDate> dates = getAllSundaysInYear(2020);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for (LocalDate date : dates) {
			System.out.println(formatter.format(date));
		}
		System.out.println("==============");
		System.out.println(formatter.format(getLastSunday(2020)));
	}
	
	private static ArrayList<LocalDate> getAllSundaysInYear(int year){
		ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
		LocalDate date = LocalDate.of(year, 1, 1);
		int count = 1;
		while (date.getYear() == year) {
			if(date.getDayOfWeek().getValue() == 7) {
				dates.add(date);
				count = 7;
			}
			date = date.plusDays(count);
		}
		return dates;
	}
	
	private static LocalDate getLastSunday(int year) {
		LocalDate date = LocalDate.of(year, 12, 31);
		while (true) {
			if(date.getDayOfWeek().getValue() == 7) {
				return date;
			}
			date = date.minusDays(1);
		}
	}
}
