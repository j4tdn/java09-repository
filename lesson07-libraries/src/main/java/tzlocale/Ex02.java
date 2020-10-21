package tzlocale;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02 {
	//TimeZone: +1, +2, Europe 
	public static void main(String[] args) {
		System.out.println("TimeZone: " + TimeZone.getDefault());
		String[] timezones = TimeZone.getAvailableIDs();
		for(String timezone: timezones) {
			System.out.println(timezone);
		}
		System.out.println("====================");
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
	}
}
