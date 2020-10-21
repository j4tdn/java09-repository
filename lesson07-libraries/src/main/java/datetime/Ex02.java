package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import common.DayOfWeek;
import utils.DateUtils;

import static java.util.Calendar.*;

public class Ex02 {

	public static void main(String[] args) {
		boolean isLeapYear = isLeapYear(2020);
		System.out.println(isLeapYear ? "LeapYear" : "Not");
		Calendar c = Calendar.getInstance();
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(2010) ? "LeapYear" : "Not");

		printYearMonthDays();

		printDaysInWeek();

	}

	// 1. kiểm tra năm nhuận
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}

	// 2. tháng. năm hiện tại có bao nhiêu ngày
	private static void printYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Days In Year: " + c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("Days In Month: " + c.getActualMaximum(DAY_OF_MONTH));

	}

	// 3. format day dd/MM/yy week_day
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int daysInMonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH);
		int year = c.get(YEAR);
		for (int day = 1; day <= daysInMonth; day++) {
			c.set(DAY_OF_MONTH, day);
			String dowString = DateUtils.getDayOfWeek(day);
			String dmy = day + "/" + month + "/" + year + "-" + dowString;
			System.out.println(dmy);
		}
	}

	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, fdow);
		for (int dow = SUNDAY; dow <= SATURDAY; dow++) {
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH) + 1;
			int year = c.get(YEAR);
			String dowString = DateUtils.getDayOfWeek(dow);
			String dmy = day + "/" + month + "/" + year + "-" + dowString;
			System.out.println(dmy);
			c.add(DAY_OF_MONTH, 1);
		}

	}
}
