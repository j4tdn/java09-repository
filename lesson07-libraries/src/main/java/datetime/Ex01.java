package datetime;

import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.Date;
import java.util.Locale;

import common.DayOfWeek;

public class Ex01 {
	public static void main(String[] args) {
		//date, month, year
		//hour 12 24, minute, second
		//day of week,month,year
		//week of year
		printDateTimeInfo();
	}
	
	private static void printDateTimeInfo () {
		// date
		Date date = new Date();
		System.out.println(date);
		//calendar
//		Calendar c = Calendar.getInstance();
		Calendar c = Calendar.getInstance(Locale.FRANCE); // set vi tri o France
		//c.set(MONTH, 3);
		System.out.println("Calendar:" + c);
		int doMonth = c.get(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1 ;
		int year = c.get(YEAR);
		int hour12 = c.get(HOUR);
		int hour24 = c.get(HOUR_OF_DAY);
		System.out.println(doMonth + "-" + month + "-" + year + "-" + hour12);
		
		//day of week
		DayOfWeek[] dows = DayOfWeek.values(); // đổi các giá trị enum thành mảng
		System.out.println("dow:" + dows[c.get(DAY_OF_WEEK)-1]);
		
		c.set(DAY_OF_MONTH,	 2);
		// first dow
//		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
	    c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		System.out.println("Default locale:" + Locale.getDefault());
		System.out.println("fdow wkday:" + c.getFirstDayOfWeek());
		System.out.println("fdow:" + c.get(DAY_OF_MONTH));
		
		// day in month
		System.out.println("days in month:" + c.getActualMaximum(DAY_OF_MONTH));  // lấy ngay max của tháng hiện tại
		// day in year
		System.out.println("days in year:" + c.getActualMaximum(DAY_OF_YEAR));
		
	}

}
