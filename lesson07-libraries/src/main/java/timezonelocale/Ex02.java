package timezonelocale;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Timezone: " + TimeZone.getDefault());
		for(String timezone : TimeZone.getAvailableIDs()) {
			System.out.println(timezone);
		}
		
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		System.out.println(c.get(Calendar.HOUR));
	}
}
