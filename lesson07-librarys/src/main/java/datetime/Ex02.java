package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;



import static java.util.Calendar.*;

public class Ex02 {
	public static void main(String[] args) {
//		boolean isLeapYear = isLeapYear(2020);
//		System.out.println(isLeapYear ? "LeapYear" : "NOT");
		
		System.out.println(isLeapYear(2020) ? "LeapYear" : "NOT");
		printYearMonthDays();
		System.out.println("===================");
		printDaysInMonth();
		System.out.println("===============");
		printDaysInWeek();
	}
	
	// 1. Kiem tra 1 nam nhuan
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(2020);
	}
	// 2. Kiem tra thang nam hien tai co bao nhieu ngay
	private static void printYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Days In Year: " + c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("Days In Month: " + c.getActualMaximum(DAY_OF_MONTH));
	}
	
	// 4. In thong tin cac ngay trong thang, tuan
	// Format: dd/MM/yyyy week_day
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int daysInMonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH + 1);
		int year = c.get(YEAR);
		for(int day = 1; day <= c.getActualMaximum(DAY_OF_MONTH); day++) {
			c.set(DAY_OF_MONTH, day);
			int dow = c.get(Calendar.DAY_OF_WEEK);
			String dowString = DateUtils.getDayOfWeek(dow);
			String dmy = day + "/" + month + "/" + year + " " + dowString;
			System.out.println(dmy);
		}
	}
	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, fdow);
		
		for(int dow = SUNDAY; dow <= SATURDAY; dow++) {
			String dowString = DateUtils.getDayOfWeek(dow);
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH);
			int year = c.get(YEAR);
			String dmy = day + "/" + month + "/" + year + " " + dowString;
			System.out.println(dmy);
			
			c.add(DAY_OF_MONTH, 1);
		}
	}
}
