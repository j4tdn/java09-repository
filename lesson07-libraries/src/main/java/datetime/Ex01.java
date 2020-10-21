package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.spi.LocaleNameProvider;

import static java.util.Calendar.*;

public class Ex01 {
	public static void main(String[] args) {
		printDateTimeInfo();
	}

	private static void printDateTimeInfo() {
		// date
		Date date = new Date();
		System.out.println(date);
		// calendar
		Calendar c = Calendar.getInstance(Locale.FRANCE);

		System.out.println("calendar" + c);
		int doMonth = c.get(DAY_OF_MONTH);
		int month = c.get(MONTH);
		int year = c.get(YEAR);
		System.out.println("d-M-Y:" + doMonth + "-" + month + "-" + year);

		// hour
		int hour = c.get(HOUR_OF_DAY);
		System.out.println("hour:" + hour);
		// day of week
		System.out.println("firt day of week");
		System.out.println("day of week:" + c.get(DAY_OF_WEEK));

		// tong so ngay trong thang
		System.out.println("days in month:" + c.getActualMaximum(DAY_OF_MONTH));

		// tong so ngay trong nam
		System.out.println("day in year" + c.getActualMaximum(DAY_OF_YEAR));

		// day of wweek
		DayOfWeek[] dOfW = DayOfWeek.values();
		System.out.println("day of week==" + dOfW[c.get(DAY_OF_WEEK) - 1]);
		System.out.println(c.get(DAY_OF_MONTH));
		System.out.println(c.get(DAY_OF_WEEK));
		System.out.println("default locale" + Locale.getDefault());
		System.out.println(c.getFirstDayOfWeek());

//		 int FirtdOFw=c.get(DAY_OF_MONTH)-c.get(DAY_OF_WEEK)+ c.getFirstDayOfWeek();
		c.add(DAY_OF_MONTH,c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		System.out.println(DAY_OF_MONTH);
	}

	enum DayOfWeek {
		Sunday, Monday, Tusday, Wednesday, Thusday, Friday, Saturday
	}
}
