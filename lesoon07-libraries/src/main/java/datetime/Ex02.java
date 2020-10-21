package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.GregorianCalendar.*;
import utils.DateUtils;
import common.DayOfWeek;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isleapYear = isLeapYear(200);
		
		System.out.println(isleapYear ? "leapYear!" : "Not");
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(isLeapYear(200) ? "leapYear!" : "Not");
		
		print();
		

	}
	
	private static boolean isLeapYear (int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
	
	private static void print() {
		Calendar c = Calendar.getInstance();
		
		System.out.println("days in years : " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("days in years : " + c.getActualMaximum(DAY_OF_MONTH));
		printDaysInMonth();
		System.out.println("===================");
		printDaysInWeek();
	}
	
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int DaysInMonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH);
		int year = c.get(YEAR);
		

		for (int day =1; day <= c.getActualMaximum(DAY_OF_MONTH); day++) {
			c.set(DAY_OF_MONTH, day);
			int dow = c.get(DAY_OF_WEEK);
			String dowString = DateUtils.getDaysOfWeek(dow);
			
			String dmy = day + "/" + month +"/" + year +"/" + dowString;
			System.out.println(dmy);
		}
	}
	
	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, fdow);
		for (int dow = SUNDAY; dow <= SATURDAY; dow++) {
			String dowString = DateUtils.getDaysOfWeek(dow);
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH);
			int year = c.get(YEAR);
			
			String dmy = day + "/" + month +"/" + year +"/" + dowString;
			System.out.println(dmy);
		}
	}

}
