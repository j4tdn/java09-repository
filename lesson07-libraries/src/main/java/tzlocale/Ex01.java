package tzlocale;

import java.util.Calendar;
import java.util.Locale;

public class Ex01 {
	public static Locale VIETNAM = new Locale("vi", "VN");
	public static void main(String[] args) {
		// locale: language, country
		// used: => Calendar#getFirsDayOfWeek();
		System.out.println(Locale.getDefault());
		// todo 1 || 2
		System.out.println("fdow: " + Calendar.getInstance(VIETNAM).getFirstDayOfWeek());
	}
}
