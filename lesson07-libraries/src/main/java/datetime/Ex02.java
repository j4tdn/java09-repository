package datetime;


import java.util.Calendar;
import java.util.GregorianCalendar;

import utils.DateUtils;

public class Ex02 {
	public static void main(String[] args) {
		// 1 kiem tra nam nhaun
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(2010) ? "LeapYear" : "no no no");
		// 2 kiem tra thang nam hien tai co bao nhieu ngay
		printYearMonthDays();
		printDaysInMonth();
		System.out.println("day in week");
		printDaysInWeek();

	}

	// 2 kiem tra thang nam hien tai co bao nhieu ngay
	private static void printYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Day in year: " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("Day in month: " + c.getActualMaximum(Calendar.DAY_OF_MONTH));

	}

	// 4 in thong tin cac ngay trong thang,tuan hien tai theo format dd/MM/yyyy
	// weekday
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		for (int day = 1; day <= daysInMonth; day++) {
			c.set(Calendar.DAY_OF_MONTH, day);
			int dow = c.get(Calendar.DAY_OF_WEEK);
			String dowString = DateUtils.getDayOfWeek(dow);
			String dmy = day + "/" + month + "/" + year + " " + dowString;
			System.out.println(dmy);
		}
	}

	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 2);
		int fdow = c.get(Calendar.DAY_OF_MONTH) - c.get(Calendar.DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.set(Calendar.DAY_OF_MONTH, fdow);
		for (int dow = Calendar.SUNDAY; dow <= Calendar.SATURDAY; dow++) {
			String dowString = DateUtils.getDayOfWeek(dow);
			int day=c.get(Calendar.DAY_OF_MONTH);
			int month=c.get(Calendar.MONTH)+1;
			int year=c.get(Calendar.YEAR);
			String dmy = day + "/" + month + "/" + year + " " + dowString;
			System.out.println(dmy);
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
	}

}
