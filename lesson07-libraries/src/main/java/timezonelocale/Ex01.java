package timezonelocale;

import java.util.Calendar;
import java.util.Locale;

public class Ex01 {
	public static Locale VIETNAM = new Locale("vi", "VN");
	public static void main(String[] args) {
		// locale: language, country
		// use for getFirstDayOfWee();
		System.out.println("Locale: " + Locale.getDefault());
		System.out.println("first day of week: " + Calendar.getInstance(VIETNAM).getFirstDayOfWeek());
		
	}
}
