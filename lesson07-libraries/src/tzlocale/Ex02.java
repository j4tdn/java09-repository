package tzlocale;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02 {
	public static void main(String[] args) {
		// timeZone:
		// System.out.println(TimeZone.getDefault());
		String[] timezones = TimeZone.getAvailableIDs();
		for (String timezone : timezones) {
			System.out.println(timezone);
		}
		System.out.println("===================================================");
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
	}

}
