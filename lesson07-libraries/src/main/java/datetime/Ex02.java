package datetime;

import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.GregorianCalendar;

public class Ex02 {
	public static void main(String[] args) {
		boolean isLeapYear = isLeapYear(2020);
		System.out.println(isLeapYear);
		
		printYearMonthDays();
//		printDaysInMonth();
		printDaysInWeek();
		
	}
	
	// kiem tra nam nhuan
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
	
	
	// thang, nam hien tai co bao nhieu ngay
	private static void printYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Days in year:" + c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("Days in month:" + c.getActualMaximum(DAY_OF_MONTH));
	}
	
	// In thong in cac ngay trong thang, tuan hien tai
	//Format:dd/MM/yy week_day
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int daysOfMonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		for (int day = 1; day <= daysOfMonth; day ++) {
			c.set(DAY_OF_MONTH, day);
			int dow = c.get(DAY_OF_WEEK);
			String dowString = DayUltis.getDayOfWeek(dow);
			String dmy = day + "/" + month + "/" + year + "week_day: " + dowString;
			System.out.println(dmy);
		}
	}
	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) - c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, fdow);
		for( int dow = SUNDAY ; dow <= SATURDAY ; dow ++) {
			String dowString = DayUltis.getDayOfWeek(dow);
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH) + 1;
			int year = c.get(YEAR);
			String dmy = day + "/" + month + "/" + year + "week_day: " + dowString;
			System.out.println(dmy);
			
			c.add(DAY_OF_MONTH, 1);
		}
	}
}
