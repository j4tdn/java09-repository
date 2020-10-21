package datetime;

import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.GregorianCalendar;

import utils.DayUtils;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(isLeapYear(2010) ? "Leap year" : "NOT");
		printYearMonthDays();
		printDaysInMonth();
		System.out.println("================");
		printDaysInWeek();
	}
	
	//1.Kiem tra nam nhuan
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
	
	//2.Thang, nam hien tai co bao nhieu ngay
	private static void printYearMonthDays() {
		Calendar c = Calendar.getInstance();
		System.out.println("Days in year: " + c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("Days in month: " + c.getActualMaximum(DAY_OF_MONTH));
	}
	
	//4.In thong tin cac ngay trong thang, tuan hien tai
	//Format: dd/MM/yyyy week_day
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int daysInMonth = c.getActualMaximum(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		for(int day=1; day<=daysInMonth; day++) {
			c.set(DAY_OF_MONTH, day);
			int dow = c.get(Calendar.DAY_OF_WEEK);
			String dowString = DayUtils.getDayOfWeek(dow);
			String dmy= day + "/" + month +"/" + year + " " + dowString ;
			System.out.println(dmy);
		}
	}
	
	private static void printDaysInWeek() {
		Calendar c = Calendar.getInstance();
		c.set(DAY_OF_MONTH, 2);
		c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		
		for(int dow = SUNDAY; dow<=SATURDAY; dow++) {
			String dowString = DayUtils.getDayOfWeek(dow);
			int day = c.get(DAY_OF_MONTH);
			int month = c.get(MONTH) + 1;
			int year = c.get(YEAR);
			String dmy= day + "/" + month +"/" + year + " " + dowString ;
			System.out.println(dmy);
			
			c.add(DAY_OF_MONTH, 1);
		}
	}

}
