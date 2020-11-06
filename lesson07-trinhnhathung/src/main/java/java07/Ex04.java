package java07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import static java.util.Calendar.*;

public class Ex04 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		ca.setTimeZone(TimeZone.getTimeZone("America/New_York"));
	}

	private static String getCurrentTimeNewYork(Calendar ca) {
		String pattern = "dd/MM/yyyy hh:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = ca.getTime();
		return df.format(date).toString();
	}

	private static int getDaysOfMonth(Calendar ca) {
		return ca.getActualMaximum(DAY_OF_MONTH);
	}

	private static String getLastDayOfMonth(Calendar ca) {
		return ca.getActualMaximum(DAY_OF_MONTH) + "/" + ca.get(MONTH) + "/" + ca.get(YEAR);
	}

	private static int getLastDayOfWeekCurrent(Calendar ca) {
		Calendar tmp = Calendar.getInstance();
		tmp = (Calendar) ca.clone();
		if (tmp.getFirstDayOfWeek() == 1) {
			tmp.add(DAY_OF_MONTH, 7 - tmp.get(DAY_OF_WEEK));
		} else {
			tmp.add(DAY_OF_MONTH, 8 - tmp.get(DAY_OF_WEEK));
		}
		return tmp.get(DAY_OF_MONTH);
	}

	private static int getFirstDayOfWeekCurrent(Calendar ca) {
		Calendar tmp = Calendar.getInstance();
		tmp = (Calendar) ca.clone();
		tmp.add(DAY_OF_MONTH, tmp.getFirstDayOfWeek() - tmp.get(DAY_OF_WEEK));
		return tmp.get(DAY_OF_MONTH);
	}

	private static int getOrderOfWeek(Calendar ca) {
		int dayOfYear = ca.get(DAY_OF_YEAR);
		return dayOfYear / 7 + ((dayOfYear % 7 == 0) ? 0 : 1);
	}
	
	private static String addHours (Calendar ca) {
		Calendar tmp = Calendar.getInstance();
		tmp = (Calendar) ca.clone();
		tmp.add(HOUR_OF_DAY, 8);
		String pattern = "dd/MM/yyyy hh:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = tmp.getTime();
		return df.format(date).toString();
	}
	
	private static void distanceTime (Calendar start,Calendar end) {
		int month = 0;
		Calendar tmp = Calendar.getInstance();
		do
		{
			tmp = (Calendar) start.clone();
			tmp.add(MONTH, 1);
			if (tmp.before(end)) {
				start =tmp;
				month++;
			} else {
				break;
			}
		} while (true);
		long year = month /12;
		month = month % 12;
		System.out.println("Distance is " + year + " years " + month + " months");
	}
	
	private static void add20Days (Calendar ca) {
		Calendar tmp = Calendar.getInstance();
		tmp = (Calendar) ca.clone();
		DayOfWeek[] dow = DayOfWeek.values();
		tmp.add(DAY_OF_MONTH, 20);
		System.out.println("After 20 days is " + dow[ca.get(DAY_OF_WEEK)-1] + " " + " date " + ca.get(DAY_OF_MONTH));
	}
	
	private static int remainMonth (Calendar ca) {
		return 12 - ca.get(MONTH);
	}
	
	private static void getAge (Calendar ca) {
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(2000, 1, 10, 0, 0,0);
		int month = 0;
		Calendar tmp = Calendar.getInstance();
		do
		{
			tmp = (Calendar) birthDay.clone();
			tmp.add(MONTH, 1);
			if (tmp.before(ca)) {
				birthDay =tmp;
				month++;
			} else {
				break;
			}
		} while (true);
		long year = month /12;
		month = month % 12;
		long startMillis = birthDay.getTimeInMillis();
		long endMillis = ca.getTimeInMillis();
		long duration = endMillis - startMillis;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("Age:" + year + " years " + month + " months " + days);
	}
	
	public enum DayOfWeek {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}
}
