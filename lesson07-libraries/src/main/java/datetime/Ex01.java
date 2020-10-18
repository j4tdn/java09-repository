package datetime;

import java.util.Calendar;
import static java.util.Calendar.*;

import java.util.Date; // import date.ulti
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		printDateTimeInfo();
	}

	private static void printDateTimeInfo() {
		// date
		
		Date date = new Date();
		System.out.println(date);

		// calendar
		Calendar c = Calendar.getInstance(Locale.FRANCE);// ko new dc vi class Calendar co ham khoi tao la private
		System.out.println("Calendar:" + c);

		System.out.println("Date :" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Date :" + c.get(DAY_OF_MONTH));// nhu nhau vi da co dong 4 phia tren
		System.out.println("Date :" + c.DAY_OF_MONTH);

		int doMonth = c.get(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1;
		int year = c.get(YEAR);

		System.out.println(doMonth + "-" + month + "-" + year);

		int hour12 = c.get(HOUR);
		int hour24 = c.get(HOUR_OF_DAY);

		System.out.println("Hour 12 :" + hour12 + ",Hour24: " + hour24);
		System.out.println("Days in month :" + c.getActualMaximum(DAY_OF_MONTH));

		// day of week
		
		System.out.println("Day of week :" + c.get(DAY_OF_WEEK));
		DayOfWeek[] dayOfWeek = DayOfWeek.values();
		System.out.println("Day of week :" + dayOfWeek[c.get(DAY_OF_WEEK) - 1]);
		
		//first day of week
		
//		int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		
		c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
		
		System.out.println("Default locale : " + Locale.getDefault());
		System.out.println("First day of week : " + c.get(DAY_OF_MONTH));
		System.out.println("First day of week : " + c.getFirstDayOfWeek());
	}
	
	enum DayOfWeek{
		Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
	}
}
