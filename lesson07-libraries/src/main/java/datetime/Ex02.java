package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import utils.DateUtils;
import static java.util.Calendar.*;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(isLeapYear(2020) ? "LeapYear" : "NOT");
		getYearMonthDays();
		try {
			printDaysInMonth();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			printDaysInWeek();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(2020);
	}
	
	private static void getYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Days in year: " + c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("Days in month: " + c.getActualMaximum(DAY_OF_MONTH));
	}
	
	private static void printDaysInMonth() throws Exception {
		Calendar c = Calendar.getInstance();
		int daysInMonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		for(int day = 1; day <= daysInMonth; day++) {
			c.set(DAY_OF_MONTH, day);
			int dayOfWeek = c.get(DAY_OF_WEEK);
			String dowString = DateUtils.getDayOfWeek(dayOfWeek);
			String dmy = day + "/" + month + "/" + year + " " + dowString;
			System.out.println(dmy);
		}
	}
	
	private static void printDaysInWeek() throws Exception {
		Calendar c = Calendar.getInstance();
		c.set(DAY_OF_MONTH, 2);
		int firstDayOfWeek = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, firstDayOfWeek);
		
		for(int dayOfWeek = SUNDAY; dayOfWeek <= SATURDAY; dayOfWeek++) {
			String dowString = DateUtils.getDayOfWeek(dayOfWeek);
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH) + 1;
			int year = c.get(YEAR);
			String dmy = day + "/" + month + "/" + year + " " + dowString;
			System.out.println(dmy);
			
			c.add(DAY_OF_MONTH, 1);
		}
	}
	
}
