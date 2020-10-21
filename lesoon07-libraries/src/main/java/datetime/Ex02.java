package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import commom.DaysOfWeek;

import utils.DateUtils;

import static java.util.Calendar.*;
public class Ex02 {
	public static void main(String[] args) {
		boolean isleapYear = isLeapYear(200);
		System.out.println(isleapYear ? "LeapYear": "Not");
	
		Calendar c = Calendar.getInstance();
		
		System.out.println(isLeapYear(200)?"Leap Year": "Not");
		
		print();
	}
	private static boolean isLeapYear(int year) {
		//return year% 400 == 0 || (year %4 == 0 && year % 4 != 0);
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
	//2 thang nam hien tai
	
	private static void print() {
		
	Calendar c =Calendar.getInstance();
		System.out.println("Days in year: "+c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("Days in year: "+c.getActualMaximum(DAY_OF_MONTH));
		printDaysInMonth();
		System.out.println("=================");
		printDaysInWeek();
	
	}
	//in thong tin cac ngay trong thang 
	//ddmmyy
	private static void printDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int month = c.get(MONTH)+1;
		int year = c.get(YEAR);
		for (int day =1 ; day <= c.getActualMaximum(DAY_OF_MONTH);day++){
			c.set(DAY_OF_MONTH, day);
			int dow = c.get(DAY_OF_WEEK);
			String dowString = DateUtils.getDaysOfWeek(dow);
			String dmy= day + "/"+month+"/"+year+"/"+dowString;
			System.out.println(dmy);
		}
	}
		
		private static void printDaysInWeek() {
			Calendar c = Calendar.getInstance();
			int fdow = c.get(DAY_OF_MONTH)-c.get(DAY_OF_WEEK)+c.getFirstDayOfWeek();
			c.set(DAY_OF_MONTH, fdow);
			for ( int dow = SUNDAY; dow <= SATURDAY ; dow++) {
				String dowString = DateUtils.getDaysOfWeek(dow);
				int day=c.get(DAY_OF_MONTH);
				int month=c.get(MONTH)+1;
				int year=c.get(YEAR);
				String dmy= day + "/"+month+"/"+year+"/"+dowString;
				
				System.out.println(dmy);
				c.add(DAY_OF_MONTH, 1);
			}
		}
	}
																							
	
	

