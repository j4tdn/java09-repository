package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(isLeapYear(200) ? "leap year " : "NOT");
		printYearMonthDays();
		System.out.println("==================");
		printDaysInMonth();
		System.out.println("==================");
		printDaysInWeek();

	}

	// ktra nam nhuan
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();

		return gc.isLeapYear(year);
	}

	// Kiem tra thang nam hien tai bao nhieu ngay
	private static void printYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Days in Year" + c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("Days in Month" + c.getActualMaximum(DAY_OF_MONTH));

	}

	// in ra thoong tin cac ngay trong thang
	// format dd/mm/yy week_day
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int daysInmonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);

		for (int day = 1; day <= daysInmonth; day++) {

			c.set(DAY_OF_MONTH, day);
			int dow = c.get(Calendar.DAY_OF_WEEK);
			
			String dowsString = DateUtils.getDayOfWeek(dow);

			String dmy = day + "/" + month + "/" + year + " " + dowsString;
			System.out.println(dmy);

		}
	}

	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		c.set(DAY_OF_MONTH, 2);
		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, fdow);
		for(int dow =SUNDAY;dow <=SATURDAY;dow++) {
			String dowsString = DateUtils.getDayOfWeek(dow);
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH)+ 1;
			int year = c.get(YEAR);
			String dmy = day + "/" + month + "/" + year + " " + dowsString;
			System.out.println(dmy);
			c.add(DAY_OF_MONTH, 1);
			
			
			
		}
		

	}
	//dem trong thang co bao nhieu ngay chu nhat va in ra xem ngay nao??
	

}
