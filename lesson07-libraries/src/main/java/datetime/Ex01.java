package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Calendar.*;

public class Ex01 {
	public static void main(String[] args) {
		// date, month, year
		// hour 12 24, minute, second
		// day of week, month,year
		// week of year
		printDateTimeInfo();
	}

	private static void printDateTimeInfo() {
		// Date
		Date date = new Date();
		System.out.println("Date:" + date);

		// Calendar
//		Calendar c = Calendar.getInstance();
		Calendar c = Calendar.getInstance(Locale.FRANCE); 
//		c.set(MONTH, 3);//set month 4
		c.set(DAY_OF_MONTH, 2);
		System.out.println("calendar: " + c);

		int doMonth = c.get(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);

		// day of week, month, year

		int hour12 = c.get(HOUR);
		int hour24 = c.get(HOUR_OF_DAY);
		System.out.println(doMonth + "-" + month + "-" + year + "-" + hour12);

		// day of week
		// 1 2 3 4 5 6 7
		// SUN, MON, TUE, WED, THU, FRI, SAT
		DayOfWeek[] dows = DayOfWeek.values();
		System.out.println("Day of week: " + dows[c.get(DAY_OF_WEEK) - 1]);

		// day of month
		int dayInMonth = c.getActualMaximum(DAY_OF_MONTH);// get days Number of month
		System.out.println("Days in month: " + dayInMonth);

		// day of year
		System.out.println("Days of year: " + c.getActualMaximum(DAY_OF_YEAR));
		
		// first dow
		//getFirstDayOfWeek() : sunday of US, monday of VN
		System.out.println("default locale: " + Locale.getDefault());
		c.set(DAY_OF_MONTH, 14);
//		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		System.out.println("fdow: " + c.get(DAY_OF_MONTH));

	}

	enum DayOfWeek {
		Sunday, Month, Tuesday, Wednesday, Thurday, Friday, Saturday
	}
}
