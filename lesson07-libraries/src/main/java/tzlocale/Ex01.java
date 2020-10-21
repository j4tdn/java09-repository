package tzlocale;

import java.util.Calendar;
import java.util.Locale;

public class Ex01 {
	public static Locale VIETNAM = new Locale("vi","VN");
	public static void main(String[] args) {
		//locale : language, country
		//used : => calendar#getFirstDayOfWeek
		System.out.println(Locale.getDefault());
		System.out.println("First day of week :" + Calendar.getInstance().getFirstDayOfWeek());
	}
}
