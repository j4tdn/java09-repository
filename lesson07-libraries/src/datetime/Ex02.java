package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;


import utils.DateUtils;

import static java.util.Calendar.*;

public class Ex02 {
	public static void main(String[] args) {
		// boolean isLeapYear = isLeapYear(2000);
		// System.out.println(isLeapYear(2000)? "Leap Year": "Not");

		System.out.println(isLeapYear(2001) ? "Leap Year" : "Not");
		
		printYearMonthDays();
		printDaysInMonth();
		System.out.println("==============");
		printDaysInWeek();
	}
	// kiem tra nam nhuan
	// private static boolean isLeapYear(int year) {
	// return year%400==0 || (year%100!=0 && year%100!=0);
	// }

	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(2001);

	}
	
	
	//kiem tra thang nam hien tai bao nhieu ngay
	private static void printYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Day in year: " +c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("Day in month: " + c.getActualMaximum(DAY_OF_MONTH));
		
	}
	
	//in thong tin ngay thang nam hien tai theo dinh dang dd//mm//yy
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int daysInMonth= c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH)+1;
		int year = c.get(YEAR);
		for(int day =1; day<= daysInMonth; day++) {
			c.set(DAY_OF_MONTH, day);
			int dow = c.get(Calendar.DAY_OF_WEEK);
			String dowString = DateUtils.getDayOfWeek(dow);
			String dmy = day + "/" + month + "/"+year + " " +dowString;
			System.out.println(dmy);
		}
	
	}
	
	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		
		c.set(DAY_OF_MONTH, 2);
		int fdow =c.get(DAY_OF_MONTH)-c.get(DAY_OF_WEEK)+c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, fdow);
		for(int dow=SUNDAY; dow<=SATURDAY; dow++) {
			String dowString = DateUtils.getDayOfWeek(dow);
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH)+1;
			int year = c.get(YEAR);
			String dmy = day + "/" + month + "/"+year + " " +dowString;
			System.out.println(dmy);
			c.add(DAY_OF_MONTH, 1);
			
		}
	}

}
