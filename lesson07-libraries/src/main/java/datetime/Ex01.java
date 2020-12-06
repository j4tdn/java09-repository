package datetime;

import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.Date;
import java.util.Locale;

import common.DayOfWeek;

public class Ex01 {
	public static void main(String[] args) {
		// date, month, year,
		// day of week, month, year
		// week of year
		// hour 12 24, minute, second

		printDateTimeInfo();

	}

	private static void printDateTimeInfo() {
		// Date: GMT UTC
		Date date = new Date();
		System.out.println("date: " + date);

		// Calendar
		// singleton pattern
		// locale: first day of week
		Calendar c = Calendar.getInstance(Locale.FRANCE);
		// c.set(MONTH, 3);

		int doMonth = c.get(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		int hour12 = c.get(Calendar.HOUR);

		System.out.println(doMonth + "-" + month + "-" + year + "-" + hour12);

		// day of week

		// 1 2 3 4 5 6 7
		// SUN, MON, TUE, WED, THU, FRI, SAT
		DayOfWeek[] dows = DayOfWeek.values();
		System.out.println("dow: " + dows[c.get(DAY_OF_WEEK) - 1]);

		c.set(DAY_OF_MONTH, 2);
		// first dow
		// dow: 21/11 Sat => 12
		//      21/10     => 10
		// int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		System.out.println("default locale: " + Locale.getDefault());
		System.out.println("fdow wkday: " + c.getFirstDayOfWeek());
		System.out.println("fdow value: " + c.get(DAY_OF_MONTH));
		
		// days in month
		System.out.println("days in month: " + c.getActualMaximum(DAY_OF_MONTH));

		// days in year
		System.out.println("days in year: " + c.getActualMaximum(DAY_OF_YEAR));
	}

}
