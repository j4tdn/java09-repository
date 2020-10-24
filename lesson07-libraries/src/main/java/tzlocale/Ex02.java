package tzlocale;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02 {
	public static void main(String[] args) {
		// timeZone:
		String[] timezones = TimeZone.getAvailableIDs();
		for (String timezone : timezones) {
			System.out.println(timezone);
		}
		System.out.println("=================");
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("VietNam/HaNoi"));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
	}
}
