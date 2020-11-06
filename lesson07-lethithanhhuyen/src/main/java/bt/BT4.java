package bt;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Calendar.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class BT4 {
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
		method5();
		method6();
		
		Calendar start = Calendar.getInstance();
		start.set(2019, 2, 18);
		Calendar end = Calendar.getInstance();
		method7(start, end);
		method8();
		method9();
		method10();
	}
	
	private static void method1() {
		Calendar c = Calendar.getInstance();
		c.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		DateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = c.getTime();
		System.out.println("1.Thời gian ở New York là: " + formatter2.format(date));
	}
	
	private static void method2() {
		Calendar c = Calendar.getInstance();
		System.out.println("2.Số ngày trong tháng hiện tại: " + c.getActualMaximum(DAY_OF_MONTH));
	}
	
	private static void method3() {
		Calendar c = Calendar.getInstance();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		c.set(DAY_OF_MONTH, c.getActualMaximum(DAY_OF_MONTH));
		Date date = c.getTime();
		System.out.println("3.Ngày cuối cùng của tháng hiện tại: " + formatter.format(date) );
	}
	
	private static void method4() {
		Calendar c = Calendar.getInstance();
		DateFormat formatter = new SimpleDateFormat("EEEE dd/MM/yyyy");
		int day = c.get(DAY_OF_WEEK) - c.getFirstDayOfWeek();
		c.roll(DAY_OF_MONTH, -day+1);
		Date date = c.getTime();
		System.out.println("3.Ngày đầu tiên của tuần: " + formatter.format(date));
		c.roll(DAY_OF_MONTH, 6);
		date = c.getTime();
		System.out.println(" Ngày cuối cùng của tuần: " + formatter.format(date));
	}
	
	private static void method5() {
		Calendar c = Calendar.getInstance();
		Calendar start = Calendar.getInstance();
		start.set(c.get(YEAR), 0, 1);
		while (start.get(DAY_OF_WEEK) != start.getFirstDayOfWeek()) {
			start.add(DAY_OF_YEAR, 1);
		}
		while (c.get(DAY_OF_WEEK) != c.getFirstDayOfWeek()) {
			c.roll(DAY_OF_YEAR, -1);
		}
		int week = (c.get(DAY_OF_YEAR) - start.get(DAY_OF_YEAR))/7 + 1;
		System.out.println("5.Ngày hiện tại đang ở tuần thứ " + week + " trong năm.");
	}
	
	private static void method6() {
		Calendar c = Calendar.getInstance();
		c.add(HOUR_OF_DAY, 8);
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = c.getTime();
		System.out.println("6.Sau khi thêm 8 tiếng vào thời gian hiện tại: " + formatter.format(date));
	}
	
	private static void method7(Calendar cstart, Calendar cend) {
		long start = cstart.getTimeInMillis();
		long end = cend.getTimeInMillis();
		long duration = end - start;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		long years = days/365;
		days -= years*365;
		long months = days/30;
		System.out.println("7.Khoảng cách: " + years + " năm, " + months + " tháng.");
	}
	
	private static void method8() {
		Calendar c = Calendar.getInstance();
		c.add(DAY_OF_YEAR, 20);
		DateFormat formatter = new SimpleDateFormat("EEEE dd/MM/yyyy");
		Date date = c.getTime();
		System.out.println("8.20 ngày nữa là ngày: " + formatter.format(date));
	}
	
	private static void method9() {
		Calendar c = Calendar.getInstance();
		int monthsLeft = 11 - c.get(MONTH) + 1;
		System.out.println("9.Số tháng còn lại trong năm: " + monthsLeft);
	}
	
	private static void method10() {
		Calendar birth = Calendar.getInstance();
		birth.set(2000, 7, 20);
		Calendar now = Calendar.getInstance();
		long start = birth.getTimeInMillis();
		long end = now.getTimeInMillis();
		long duration = end - start;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		long years = days/365;
		days = days - years*365;
		long months = days/30;
		days -= months*30;
		System.out.println("10.Tuổi của tôi: " + years + " năm, " + months + " tháng, " + days + " ngày.");
	}
}
