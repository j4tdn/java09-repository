package datetime;

import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.Date;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		//date, month, year
		//day of week, month, year
		//week of year
		//hour 12, hour 24, minute, second 
		printDateTimeInfo();
	}

	private static void printDateTimeInfo() {
		//Date
		Date date = new Date();
		System.out.println("date: " + date);

		//Calendar
		//singleton pattern
		Calendar c = Calendar.getInstance(Locale.FRANCE);
		//c.set(MONTH,3);
		int doMonth = c.get(DAY_OF_MONTH);
		int month = c.get(MONTH)+1;
		int year = c.get(YEAR);
		System.out.println(doMonth + "-" + month + "-"+ year);

		int hour12 = c.get(HOUR);
		int hour24 = c.get(HOUR_OF_DAY);
		int minute = c.get(MINUTE);
		int second = c.get(SECOND);
		System.out.println(hour12);

		//day of week
		DayOfWeek[] dows = DayOfWeek.values();
		System.out.println("day of week: " + dows[c.get(DAY_OF_WEEK) - 1]);

		c.set(DAY_OF_MONTH, 2);
		//first dow
//		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		System.out.println("default locale: " + Locale.getDefault());
		System.out.println("first day of week: " + c.get(DAY_OF_MONTH));

		//days in month
		System.out.println("days in month: " + c.getActualMaximum(DAY_OF_MONTH));

		//days in year
		System.out.println("days in year: " + c.getActualMaximum(DAY_OF_YEAR));

	}

	enum DayOfWeek {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}
}