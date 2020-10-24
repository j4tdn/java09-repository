package datetime;

import static java.util.Calendar.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import utils.DateUtils;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(isLeapYear(200) ? "Leap year" : "not");
		System.out.println("=====================");
		printYearMonthDays();
		System.out.println("=====================");
		printDaysInMonth();
		System.out.println("=====================");
		printDaysInWeek();
	}

//1.kiểm tra năm nhuận
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}

//2.tháng, năm hiện tại bao nhiêu ngày
	private static void printYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Days in Year: " + c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("Days in month: " + c.getActualMaximum(DAY_OF_MONTH));

	}

	// 4. In thông tin các ngày trong tháng, trong tuần
	// format :dd/MM/yyyy week_day
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int daysInMonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		for (int day = 1; day <= daysInMonth; day++) {
			c.set(DAY_OF_MONTH, day);
			int dow = c.get(Calendar.DAY_OF_WEEK);
			String dowString = DateUtils.getDayOfWeek(dow);
			String dmy = day + "/" + month + "/" + year + '/' + dowString;
			System.out.println(dmy);
		}
	}

	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		// c.set(DAY_OF_MONTH, fdow);
		c.set(DAY_OF_MONTH, 2);
		for (int dow = SUNDAY; dow <= SATURDAY; dow++) { 
			String dowString = DateUtils.getDayOfWeek(dow);
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH) + 1;
			int year = c.get(YEAR);
			String dmy = day + "/" + month + "/" + year + '/' + dowString;
			System.out.println(dmy);
			c.add(DAY_OF_MONTH, 1);
		}

	}
}
