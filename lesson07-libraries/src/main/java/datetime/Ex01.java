package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Calendar.*;

/**
 * Hello world!
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		printDateTimeInfo();

	}

	private static void printDateTimeInfo() {
    	//date, month ,year
    	// hour 12 24, minute, second
    	// day of week, month, year
    	//week of year
		//Date
		Date date = new Date();
		date.getMonth();
		System.out.println("date: " + date);
		
		// Calendar
		Calendar c= Calendar.getInstance(Locale.FRANCE);
		c.set(DAY_OF_MONTH, 2);
		System.out.println("Calender : " + c);
		int doMonth = c.get(DAY_OF_MONTH);
		int Month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		int hour12 = c.get(Calendar.HOUR);
		int hour24 = c.get(Calendar.HOUR);
		System.out.println("D-M-Y: " + doMonth + "-" + Month + "-" + year  );

		// day of week,
		
		System.out.println("days in week :" + c.get(DAY_OF_WEEK));
		
		//days in month
		System.out.println("days in month :" + c.getActualMaximum(DAY_OF_MONTH));
		System.out.println("days in year :" + c.getActualMaximum(DAY_OF_YEAR));
		
		//enum
		DayOfWeek[] dows = DayOfWeek.values();
		System.out.println("dow: " + dows[c.get(DAY_OF_WEEK)-1]);
		
		c.set(Calendar.DAY_OF_MONTH,14);
		
		
		//first dow
		//int fdow= c.get(DAY_OF_MONTH)- c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK);
		System.out.println("default locale: " + Locale.getDefault());
		System.out.println("fdow wkday : "+ c.getFirstDayOfWeek());
		//System.out.println("fdow : "+ fdow);
		
		
			}

	enum DayOfWeek {
		Sunday, Monday, Tuesday, Wednesday, Thurdays, Fridays
	}
}
