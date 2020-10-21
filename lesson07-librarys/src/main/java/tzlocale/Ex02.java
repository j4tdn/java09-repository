package tzlocale;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02 {
	// TimeZone: 
	public static void main(String[] args) {
		System.out.println(TimeZone.getDefault());
		String[] timezones = TimeZone.getAvailableIDs();
		for(String timezone: timezones) {
			System.out.println(timezone);
		}
		System.out.println("===============");
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC+5"));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
	}
}
