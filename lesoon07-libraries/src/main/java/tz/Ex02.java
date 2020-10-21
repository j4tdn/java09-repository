package tz;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(TimeZone.getDefault());
		//System.out.println(TimeZone.getAvailableIDs());
		
		//String[] timezones = TimeZone.getAvailableIDs();
		//for(String timezone: timezones) {
			//System.out.println(timezone);
		//}
		
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("EUROPE/Berlin"));
		System.out.println(c);
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
	}

}
