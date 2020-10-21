package tz;

import java.util.Calendar;
import java.util.Locale;
public class Ex01 {
	public static Locale VietNam = new Locale ("vi","VN");
public static void main(String[] args) {
	System.out.println(Locale.getDefault());
	System.out.println("fdow : " + Calendar.getInstance(VietNam).getFirstDayOfWeek());
}
}
