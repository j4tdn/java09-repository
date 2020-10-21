package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Calendar.*;

public class Ex01 {
	public static void main(String[] args) {
		// date, month, year
		// hour, minute, second
		// day of week , month, year
		// week of year
		printDateTimeInfo();
	}
	
	private static void printDateTimeInfo() {
		// Date 
		Date date = new Date();
		System.out.println("date:" + date);
		// Calendar
		// singleton pattern
		Calendar c = Calendar.getInstance(Locale.FRANCE);
		c.set(MONTH, 3);
		System.out.println("Calender " + c);
		System.out.println("date: " + c.get(DAY_OF_MONTH));
		System.out.println("month: " + c.get(MONTH));
		System.out.println("years: " + c.get(YEAR));
		
		
		System.out.println(c.get(DAY_OF_MONTH) + "-" + c.get(MONTH) + c.get(YEAR));
		
		// day of week, month , year
		
		int hour12 = c.get(Calendar.HOUR);
		int hour24 = c.get(Calendar.HOUR);
		
		// days in month
		System.out.println("days in month: " + c.getActualMaximum(DAY_OF_MONTH));
		
		// days in year
		System.out.println("day in year: " + c.getActualMaximum(DAY_OF_YEAR));
		
//		// days of week
//		DAY_OF_WEEK[] dows = DayOfWeek.values();
//		System.out.println("dow: " + c.get(Calendar.DAY_OF_WEEK));
		
		// first dow
//		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		 c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		System.out.println("default locale: " + Locale.getDefault());
		System.out.println("fdow wkday: " + c.getFirstDayOfWeek());
		System.out.println("fdow value: " + c.get(DAY_OF_MONTH));
	}
	
}
