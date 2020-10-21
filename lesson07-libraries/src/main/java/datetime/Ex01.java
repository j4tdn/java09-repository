package datetime;

import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.Date;
import java.util.Locale;


public class Ex01 {
	public static void main(String[] args) {
		//date, month, year, hour 12 24
		//hour 12 24, minute, second
		//day of week, month, year
		//week of year
		printDateTimeInfo();
	}
	private static void printDateTimeInfo() {
		//Date
		Date date = new Date();
		System.out.println("date: " + date);
		
		//Calender
		Calendar c = Calendar.getInstance();
		//c.set(MONTH, 10);
		
		int doMonth = c.get(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		System.out.println("d - M - Y: " + doMonth + "-" + month + "-" + year);
		
		int hour12 = c.get(Calendar.HOUR);
		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(doMonth
				+ "-" + month 
				+ "-" + year 
				+ "-" + hour12);
		//days of week
		//1 2 3 4 5 6 7
		//SUN, MON, TUE, WED, THU, FRI, SAT
		DayOfWeek[] dows = DayOfWeek.values();
		System.out.println("days of week : " + dows[c.get(DAY_OF_WEEK) - 1]);
		
		c.set(Calendar.DAY_OF_MONTH, 2);
		//first day of week
		//int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		
		System.out.println("default locate: " + Locale.getDefault());
		System.out.println("fdow wkday: " + c.getFirstDayOfWeek());
		System.out.println("fdow: " + c.get(DAY_OF_MONTH));
		
		//days in month
		System.out.println("days int month: " + c.getActualMaximum(DAY_OF_MONTH));
		
		//days int year
		System.out.println("days in year : " + c.getActualMaximum(DAY_OF_YEAR));
		
		
	}
	
	enum DayOfWeek {
		Sunday, Monday, Tuesday, Webnesday, Thursday, Friday, Saturday
	}
}
