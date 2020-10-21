package datetime;

import static java.util.Calendar.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import utils.DateUtils;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(isLeapYear(2020)?"is leap year": "NOT");
		printYearMonthDay();
		printDaysInMonth();
		System.out.println("========");
		printDaysInWeekk();
		}
	
	
	//1.kiem tra 1 nam co phai nam nhuan hay khong
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc=new GregorianCalendar();
		return gc.isLeapYear(year);
	}
	//2.kiem tra thang nam co bao nhieu ngay
	private static void printYearMonthDay() {
		Calendar c=Calendar.getInstance();
		System.out.println("day in year:"+c.getActualMaximum(DAY_OF_YEAR));
		System.out.println("day in month:"+c.getActualMaximum(DAY_OF_MONTH));
	}
	//4.in tat ca cac ngay trong thang , tuan format dd/mm/yyy
//	private static void printDaysInMonth() {
//		Calendar c=Calendar.getInstance();
//		int month=c.get(MONTH);
//		int year=c.get(YEAR);
//		int daysInMonth=c.getActualMaximum(DAY_OF_MONTH);
//		for(int day=1;day<=daysInMonth;day++) {
//			String dmy=day+"/"+month+"/"+year;
//			System.out.println(dmy);
//		}
//	}
	private static void printDaysInMonth() {
		Calendar c=Calendar.getInstance();
		int month=c.get(MONTH)+1;
		int year=c.get(YEAR);
		int daysInMonth=c.getActualMaximum(DAY_OF_MONTH);
		for(int day=1;day<=daysInMonth;day++) {
			c.set(DAY_OF_MONTH, day);
			int dow=c.get(DAY_OF_WEEK);
			String dowString=DateUtils.getDayOfWeek(dow);
			String dmy=day+"/"+month+"/"+year+dowString;
			System.out.println(dmy);
		}
	}
	private static void printDaysInWeekk() {
		Calendar c=Calendar.getInstance();
		c.set(DAY_OF_MONTH, 2);
		int Fdow=c.get(DAY_OF_MONTH)-c.get(DAY_OF_WEEK)+ c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, Fdow);
		for(int dow=SUNDAY;dow<=SATURDAY;dow++) {
			int day=c.get(DAY_OF_MONTH);
			int month=c.get(MONTH)+1;
			int year=c.get(YEAR);
			String dowString=DateUtils.getDayOfWeek(dow);
			String dmy=day+"/"+month+"/"+year+"--"+dowString;
			System.out.println(dmy);
			
			c.add(DAY_OF_MONTH, 1);
			
		}
	}
}
