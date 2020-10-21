package tzlocale;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02 {
	public static void main(String[] args) {
		String[] timezones = TimeZone.getAvailableIDs();
//		for (String timezone : timezones) {
//			System.out.println(timezone);
//		}
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
	}
	

	
}
