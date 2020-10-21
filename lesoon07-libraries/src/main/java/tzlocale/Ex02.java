package tzlocale;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02 {
	// timeZone : +1 +12, Europe
	public static void main(String[] args) {
		System.out.println(TimeZone.getDefault());
		String[] timeZones = TimeZone.getAvailableIDs();
		for (String timeZone : timeZones) {
			System.out.println(timeZone);
		}
		System.out.println("===============");
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
	}

}
