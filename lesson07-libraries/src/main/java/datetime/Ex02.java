package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import utils.DateUtils;

import static java.util.Calendar.*;

public class Ex02 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(isLeapYear(100) ? "LeapYear" : "Not");
		printYearMonthDays();
		printDaysInMonth();
		System.out.println("=================");
		printDaysInWeek();
	}

	// 1. kiem tra nam nhuan
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}

	// 2. kiem tra thang nam hien tai bao nhieu ngay
	private static void printYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Days In year:" + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("Days In month:" + c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	// 4. In thong tin cac ngay trong thang, tuan
	// Format dd/MM/yyyy weekday
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int daysInMonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		for (int day = 1; day <= daysInMonth; day++) {
			c.set(DAY_OF_MONTH, day);
			int dow = c.get(DAY_OF_WEEK);
			String dowString = DateUtils.getDateOfWeek(dow);
			String dmy = day + "/" + month + "/" + year + " " + dowString;
			System.out.println(dmy);
		}
	}
	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		c.set(DAY_OF_MONTH, 2);
		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, fdow);
		for (int dow = SUNDAY; dow<= SATURDAY;dow++) {
			String dowString = DateUtils.getDateOfWeek(dow);
			int month = c.get(MONTH) + 1;
			int year = c.get(YEAR);
			int day = c.get(DAY_OF_MONTH);
			String dmy = day + "/" + month + "/" + year + " " + dowString;
			System.out.println(dmy);
			c.add(DAY_OF_MONTH, 1);
		}
	}
}
