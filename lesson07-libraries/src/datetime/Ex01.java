package datetime;

import java.util.Calendar;
import static java.util.Calendar.*;// rut gon calendar.day_of_month -> day_of_month
import java.util.Date;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// date, month, year
		// hour, minute, second
		// day of week, month, year
		// weak of year
		printDateTimeInfo();
	}

	private static void printDateTimeInfo() {
		// Date
		Date date = new Date(); // import longday date(sogiay) tinh so ngay tu ngay 1/1/1970
		System.out.println("date" + date);
		// Calendar
		// Calendar c = new Calendar(); khong cho new vi private
		// singleton pattern: de 1 class chi tao 1 doi tuong duy nhat
		Calendar c = Calendar.getInstance(Locale.FRANCE);
		// c.set(MONTH, 3);
		System.out.println("calendar " + c); // GregorianCalendar duong lich
		int doMonth = c.get(DAY_OF_MONTH);
		int month = c.get(MONTH) + 1; // quy uoc january = 0
		int year = c.get(YEAR);
		System.out.println("d-m-y: " + doMonth + " - " + month + " - " + year);
		// hour, minute, second
		int hour12 = c.get(HOUR);
		int hour24 = c.get(HOUR_OF_DAY);
		// day of week
		DayOfWeek[] dows = DayOfWeek.values();
		System.out.println("day of week = " + dows[c.get(DAY_OF_WEEK )-1]);

		// days in month
		System.out.println("days in month = " + c.getActualMaximum(DAY_OF_MONTH)); // actual hien ta

		// day in year
		System.out.println("days in year = " + c.getActualMaximum(DAY_OF_YEAR));
		
		c.set(DAY_OF_MONTH, 2);
		
		//first dow
		//
		//int fdow = c.get(DAY_OF_MONTH) -c.get(DAY_OF_WEEK) +c.getFirstDayOfWeek();D
		 c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK) );
		System.out.println("fdow value " + c.get(DAY_OF_MONTH));
		System.out.println("default localte" + Locale.getDefault());
		System.out.println("fdow wkday " +c.getFirstDayOfWeek());
	}
	

	enum DayOfWeek {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Fiday, Saturday
	}
	

}
