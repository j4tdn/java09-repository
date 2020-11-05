package exercises.java07;

import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class Ex01 {
	
	public static void main(String[] args) {
		ArrayList<Date> dates = getAllSundaysInYear(2020);
		String pattern = "dd/MM/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
		
		for (Date date : dates) {
			System.out.println(df.format(date.getTime()));
		}
		System.out.println("==============");
		System.out.println(df.format(getLastSunday(2020).getTime()).toString());
		
	}
	
	private static ArrayList<Date> getAllSundaysInYear(int year){
		ArrayList<Date> dates = new ArrayList<Date>();
		Calendar date = Calendar.getInstance();
		date.set(year, 0, 1);
		int count = 1;
		while (date.get(YEAR) == year) {
			if(date.get(DAY_OF_WEEK) == SUNDAY) {
				dates.add(date.getTime());
				count = 7;
			}
			date.add(DAY_OF_YEAR, count);
		}
		return dates;
	}
	
	private static Calendar getLastSunday(int year) {
		Calendar date = Calendar.getInstance();
		date.set(year, 11, 31);
		while (true) {
			if(date.get(DAY_OF_WEEK) == SUNDAY) {
				return date;
			}
			date.add(DAY_OF_YEAR, -1);
		}
	}
}
