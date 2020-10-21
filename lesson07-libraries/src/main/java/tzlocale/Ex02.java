package tzlocale;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02 {
	public static void main(String[] args) {
		// timezone : +1 +2 ,Europe
		System.out.println(TimeZone.getDefault());
		String[] timezones = TimeZone.getAvailableIDs();
//		for (String timezone : timezones) {
//			System.out.println(timezone);
//		}
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC -9:00"));
		System.out.println(c.get(Calendar.HOUR));
		
	}
}
