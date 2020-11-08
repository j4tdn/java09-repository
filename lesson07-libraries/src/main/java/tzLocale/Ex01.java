package tzLocale;

import java.util.Calendar;
import java.util.Locale;

public class Ex01 {
	public static Locale VIETNAM=new Locale("vi", "VN");
	public static void main(String[] args) {
		//locale: language,country
		//use:=> Calendar:getFirtDayOfWeek
		System.out.println(Locale.getDefault());
		System.out.println("Fdow="+Calendar.getInstance(VIETNAM).getFirstDayOfWeek());
	}
}
