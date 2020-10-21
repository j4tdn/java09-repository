package tzlocale;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class Ex01 {
	public static Locale VIETNAM=new Locale("vi", "VN");
	//locale : language, country
	//used :=> Calenda.getFirstDayOfWeek
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		System.out.println("fdow: "+Calendar.getInstance(VIETNAM).getFirstDayOfWeek());
	}
}
