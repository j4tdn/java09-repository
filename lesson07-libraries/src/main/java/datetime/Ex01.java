package datetime;
import static java.util.Calendar.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
//	date,month,year, 
//	day of week, month, year
//	week of year
//	hours 12,24,minute,second 
		printDateTimeInfo();
	}

	private static void printDateTimeInfo() {
		// date
		Date date = new Date();
		System.out.println("date: " + date);
		
// calendar
		Calendar c=Calendar.getInstance();//khong new dc vi ham calendar ham constructor private
		System.out.println("calendar "+c);
		System.out.println("date: "+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("date: "+c.get(DAY_OF_MONTH));
		int doMonth =c.get(DAY_OF_MONTH);
		int month=c.get(MONTH)+1;
		int year=c.get(YEAR);
		int hour12=c.get(Calendar.HOUR);
		c.set((DAY_OF_MONTH),2);
		System.out.println(doMonth+"--"+month+"--"+year+"--"+hour12);
		//days of week
		System.out.println("days in week "+ c.get(Calendar.DAY_OF_WEEK));
		DayOfWeek[] dows =DayOfWeek.values();
		//first dow
		int fdow =c.get(DAY_OF_MONTH)-c.get(DAY_OF_WEEK)+1;
		System.out.println("default locale: "+Locale.getDefault());
		System.out.println("fdow wkday"+c.getFirstDayOfWeek());
		System.out.println("fdow value:  "+fdow);
		System.out.println("dows: "+dows[c.get(DAY_OF_WEEK)-1]);
		c.add(DAY_OF_MONTH,c.getFirstDayOfWeek()-c.get(DAY_OF_WEEK));
		System.out.println();
		//days in month 
		System.out.println("days in monnth: "+c.getActualMaximum(DAY_OF_MONTH));
		//days in year
		System.out.println("days in year: "+c.getActualMaximum(DAY_OF_YEAR));
	}
	enum DayOfWeek{
		sunday,monday,tuesday,wednesday,thursday,friday,saturday;
	}

}
