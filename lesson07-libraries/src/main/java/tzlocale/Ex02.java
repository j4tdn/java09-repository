package tzlocale;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02 {
	public static void main(String[] args) {
		// TImeZone: +1, +2, Europe
		String[] timezones = TimeZone.getAvailableIDs();
		for (String timezone : timezones) {
			System.out.println(timezone);
		}
		System.out.println("========================");
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/Newyork"));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
	}
}
