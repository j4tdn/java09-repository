package datetime;

import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.GregorianCalendar;

import utils.DateUtils;

public class Ex02 {
	public static void main(String[] args) {
		boolean isLeapYear = isLeapYear(2020);
		System.out.println(isLeapYear ? "LeapYear" : "NOT");
		getYearMonthDays();
		printDaysInMonth();
		printDayInWeek();
	}

	// 1, kiểm tra năm nhuận
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}

	// 2. kiểm tra tháng, năm hiện tại có bao nhiêu ngày

	private static void getYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Days in year: " + c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("Days in month: " + c.getActualMaximum(DAY_OF_MONTH));
	}

	// 3.in thông tin các ngày trong tháng , tuần hiện tại với format: dd/MM/yyyy
	// week_day
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int daysInMonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		for (int day = 1; day <= daysInMonth; day++) {
			c.set(DAY_OF_MONTH, day);
			int dow = c.get(DAY_OF_WEEK);
			String dowString = DateUtils.getDayOfWeek(dow);
			String dmy = day + "/" + month + "/" + year;
			System.out.println(dmy);
		}

	}
	public static void printDayInWeek() {
		Calendar c = Calendar.getInstance();
		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, fdow);
		for(int dow = SUNDAY; dow <= SATURDAY; dow++) {
			String dowString = DateUtils.getDayOfWeek(dow);
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH) + 1;
			int year = c.get(YEAR);
			
			String dmy = day + "/" + month + "/" + year +" " + dowString;
			System.out.println(dmy);			
			c.add(DAY_OF_MONTH, 1);
		}
	}
	
	
}
