package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import common.DayOfWeek;

import static java.util.Calendar.*;

public class Ex01 {
	public static void main(String[] args) {
		// day , month , year
		// hour 12 24 , minute , year
		// day of week , month , year
		// week of year
		printDateTimeInfo();
	}

	private static void printDateTimeInfo() {
		// Date : GMT , UTC
		Date date = new Date();
		System.out.println("Date : " + date);

		// Calendar
		// singleton pattern
		Calendar c = Calendar.getInstance(Locale.FRANCE);
		// c.set(MONTH, 3);

		System.out.println("Calendar " + c);
		int doMonth = c.get(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);
		System.out.println("D - M - Y: " + doMonth + "-" + month + "-" + year);

		// hour 12 || 24
		int hour12 = c.get(HOUR);
		int hour24 = c.get(HOUR_OF_DAY);

		// day of week
		DayOfWeek[] dows = DayOfWeek.values();
		System.out.println("dows: " + dows[c.get(DAY_OF_WEEK) - 1]);

		c.set(Calendar.DAY_OF_MONTH, 2);
		// first dow
		// int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		System.out.println("fdow value: " + c.get(DAY_OF_MONTH));
		System.out.println("default locale : " + Locale.getDefault());
		System.out.println("fow wkday:" + c.getFirstDayOfWeek());

		// day in month
		System.out.println("Days in month: " + c.getActualMaximum(DAY_OF_MONTH));

		// day in year
		System.out.println("Days in year:" + c.getActualMaximum(DAY_OF_YEAR));

	}

	}

