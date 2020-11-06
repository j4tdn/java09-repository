package java07;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex04 {
	public static void main(String[] args) {
		// 1
		int year, month, day, hour, minute, second;
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC-5"));
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH) + 1;
		day = c.get(Calendar.DAY_OF_MONTH);
		hour = c.get(Calendar.HOUR);
		minute = c.get(Calendar.MINUTE);
		second = c.get(Calendar.SECOND);
		System.out.println(
				"date in newyork:" + year + "/" + month + "/" + day + "/" + hour + "h/" + minute + "p/" + second + "s");
		// 2
		System.out.println("month current has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " day");
		// 3
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("the last day of month current:" + cal.get(Calendar.YEAR) + "-"
				+ (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH));
		// 4

		int dows = c.get(Calendar.DAY_OF_WEEK);
		int fdow = c.get(Calendar.DAY_OF_MONTH) - dows + c.getFirstDayOfWeek();
		cal.set(Calendar.DAY_OF_MONTH, fdow);
		cal.add(Calendar.DAY_OF_MONTH, 6);
		int ldow = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("first day of week current and last day of week:" + fdow + "-------" + ldow);
		// 5
		System.out.println("Current week is " + c.get(Calendar.WEEK_OF_YEAR) + " of year");
		// 6
		cal.set(year, month, day, hour, minute, second);
		cal.add(Calendar.HOUR, 8);
		System.out.println("time after add 8hours is " + cal.get(Calendar.DAY_OF_MONTH) + "d-" + cal.get(Calendar.HOUR)
				+ "h-" + cal.get(Calendar.MINUTE) + "p-" + cal.get(Calendar.SECOND) + "s");
		// 7 long from c -> cal
		
		//8
		cal.set(year, month, day, hour, minute, second);
		cal.add(Calendar.DAY_OF_MONTH, 20);
		String[] name= {"","Sunday","Monday","Tuesday","Wednesday","Thurday","Friday","Saturday"};
		int n=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("after 20 days is day "+ cal.get(Calendar.DAY_OF_MONTH)+" and is "+name[n]);
		
		//9
		System.out.println("the rest month of year :"+(12-c.get(Calendar.MONTH)-1));
		
		//10
		Calendar birthDayYear = Calendar.getInstance();
		birthDayYear.set(Calendar.YEAR, 1999);
		System.out.println("Age of me:" + (c.get(Calendar.YEAR) - birthDayYear.get(Calendar.YEAR)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
