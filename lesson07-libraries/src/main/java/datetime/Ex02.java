package datetime;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

import utils.DateUtils;

import static java.util.Calendar.*;

public class Ex02 {
	public static void main(String[] args) {
		boolean isLeapYear = isLeapYear(2020);
		System.out.println(isLeapYear ? "LeapYear" : "NOT");//xác định năm nhuận hay k
//		System.out.println(gc.isLeapYear(2020) ? "LeapYear" : "NOT");//xác định năm nhuận hay k
		Calendar c = Calendar.getInstance();
		
		printYearMonthDays();
		
		printDaysInMonth();
		System.out.println("============================");
		
		printDaysInWeek();
		
		
		
	}

	// 1.Kiểm tra năm nhuận
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
	
	private static void printYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Day of year: " + c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("Day of month: " + c.getActualMaximum(DAY_OF_MONTH));
	}
	
//	4. In thông tin các ngày trong tháng, tuần
//	Format: dd/MM/yyyy week_day
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int daysInMonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		for (int day = 1; day < daysInMonth; day++) {
			c.set(DAY_OF_MONTH, day);
			int dow = c.get(DAY_OF_WEEK);
			String dowString = DateUtils.getDayOfWeek(dow);
			String dmy = day + "/" + month + "/" + year + " " + dowString;
			System.out.println(dmy);
		}
	}
	
	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		c.set(DAY_OF_MONTH, 2);
//		c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, fdow);
		
		for (int dow = SUNDAY; dow <= SATURDAY; dow++) {
			String dowString = DateUtils.getDayOfWeek(dow);
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH) + 1;
			int year = c.get(YEAR);
			String dmy = day + "/" + month + "/" + year + " " + dowString;
			System.out.println(dmy);
			c.add(DAY_OF_MONTH, 1);
		}
	}
}
